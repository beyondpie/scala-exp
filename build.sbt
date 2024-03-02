ThisBuild / scalaVersion := "2.13.13"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello"
  )

// for rscala
crossScalaVersions := Seq("2.11.12", "2.12.7", "2.13.0-M5")

libraryDependencies += "org.ddahl" %% "rscala" % "3.2.19"
