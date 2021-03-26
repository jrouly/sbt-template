name := "sbt-template"
organization := "net.rouly"
description := "Template for sbt based Scala projects."

homepage := Some(url("https://github.com/jrouly/sbt-template"))
licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

publishMavenStyle := false
artifactory := artifactoryCloud("jrouly")

scriptedBufferLog := false
scriptedLaunchOpts ++= Seq("-Xmx1024M", "-server", "-Dplugin.version=" + version.value)

Global / onChangedBuildSource := ReloadOnSourceChanges
