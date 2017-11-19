
import sbt._

object Dependencies extends Versions {

  lazy val commonDependencies = Seq(
    "org.slf4j" % "slf4j-api" % slf4jVersion,
    "org.scalatest"   %% "scalatest" % scalaTestVersion   % "test"
  )

  lazy val kafkaDependencies = Seq(
    "org.slf4j" % "slf4j-api" % slf4jVersion,
    "org.scalatest"   %% "scalatest" % scalaTestVersion   % "test"
  )


  lazy val appDependencies = Seq(
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "org.scalatest"   %% "scalatest" % scalaTestVersion   % "test"
  )

}

trait Versions {

  lazy val slf4jVersion = "1.7.25"
  lazy val scalaTestVersion = "3.0.4"

}