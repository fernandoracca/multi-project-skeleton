resolvers += Classpaths.sbtPluginReleases

// See docs : https://github.com/sbt/sbt-native-packager
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.1")
//Documentation is not published, which can cause some issues when using Intellij's SBT Shell Library 


//just a useful tool graph depenency tool. comment out if having troubles behind certain proxies
//addSbtPlugin("net-virtual-void" % "sbt-dependency-graph" % "0.9.0")