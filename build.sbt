import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.boa"
ThisBuild / organizationName := "rtj"

val zioVersion = "2.0.2"

lazy val root = (project in file("."))
  .settings(
    name := "zio2-seed",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioVersion,
      "dev.zio" %% "zio-streams" % zioVersion,
      scalaTest % Test
    )
  )
