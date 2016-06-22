val commonSettings = Seq(
  scalaVersion := "2.11.8",
  organization := "io.leonard",
  scalacOptions ++= Seq("-Xfatal-warnings", "-feature"))

lazy val `sbt-template` = project.in(file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.6" % "test"
    )
  )

