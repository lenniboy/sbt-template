import scalariform.formatter.preferences._

val scalacOpts = Seq(
  "-target:jvm-1.8",
  "-encoding",
  "UTF-8",
  "-deprecation", // warning and location for usages of deprecated APIs
  "-feature", // warning and location for usages of features that should be imported explicitly
  "-language:postfixOps",
  "-unchecked", // additional warnings where generated code depends on assumptions
  "-Xlint", // recommended additional warnings
  "-Xcheckinit", // runtime error when a val is not initialized due to trait hierarchies (instead of NPE somewhere else)
  "-Xfatal-warnings", // all warnings become errors
  "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver
  "-Ywarn-value-discard", // Warn when non-Unit expression results are unused
  "-Ywarn-inaccessible",
  "-Ywarn-dead-code",
  "-Ywarn-unused"
  //"-Ywarn-unused-import"
)

val commonSettings = Seq(
  scalaVersion := "2.11.8",
  organization := "io.leonard",
  scalacOptions ++= scalacOpts
)

scalariformSettings ++ Seq(
  ScalariformKeys.preferences := ScalariformKeys.preferences.value
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(DoubleIndentClassDeclaration, true)
    .setPreference(PreserveDanglingCloseParenthesis, true)
    .setPreference(PreserveSpaceBeforeArguments, true)
)

lazy val `sbt-template` = project.in(file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= Seq(
      "org.clapper" %% "grizzled-slf4j" % "1.1.0",
      "ch.qos.logback" % "logback-classic" % "1.1.7",
      "org.scalatest" %% "scalatest" % "3.0.0" % "test"
    )
  )

