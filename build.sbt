val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "fp-in-scala",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
  )
