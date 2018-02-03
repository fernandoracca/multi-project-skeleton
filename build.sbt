
name := "multi-project-skeleton"

import Dependencies._

// For Settings/Task reference, see http://www.scala-sbt.org/release/sxr/sbt/Keys.scala.html

lazy val common = (project in file("common")).settings(commonSettings)

lazy val kafka = (project in file("kafka")).settings(kafkaSettings).dependsOn(common)

lazy val app = (project in file("app")).
  settings(appSettings).
  dependsOn(kafka).
  dependsOn(common).
  enablePlugins(UniversalPlugin).
  enablePlugins(JavaAppPackaging)

lazy val root = Project(
  id = "root",
  base = file(".")
).aggregate(common, kafka, app)
 .settings(Defaults.coreDefaultSettings ++ dontPublishRootModuleSettings)

lazy val generalModuleSettings = Seq(
  organization := "com.github.fractal",
  version := "1.4",
  scalaVersion := "2.12.4",
  // Compiler settings. Use scalac -X for other options and their description.
  // See Here for more info http://www.scala-lang.org/files/archive/nightly/docs/manual/html/scalac.html
  scalacOptions ++= List("-feature","-deprecation", "-unchecked", "-Xlint"),

  // Uncommenting this line sometime helps troubleshooting if you are having issues with jars download (for example, if behind a proxy)
  //ivyLoggingLevel := UpdateLogging.Full
  Test / publishArtifact := false,
  publishTo := {
    val basePublishingUrl = "http://internal-repo/" //your proxy reporsitory url
    val suffix = if(isSnapshot.value) "snapshots" else "releases"
    val internalRepoBaseName = "internal-repo"
    Some(s"$internalRepoBaseName-$suffix" at (basePublishingUrl + suffix))
  }
)

lazy val dontPublishRootModuleSettings = Seq(
  publishLocal := {},
  publish := {}
)


lazy val commonSettings = generalModuleSettings ++ Seq(
  libraryDependencies ++= commonDependencies
)

lazy val kafkaSettings = generalModuleSettings ++ Seq(
  libraryDependencies ++= kafkaDependencies
)

lazy val appSettings = generalModuleSettings ++ Seq(
  libraryDependencies ++= appDependencies
)
