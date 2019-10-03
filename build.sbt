name := "cats-effect-bincompat"

version := "0.1"

scalaVersion := "2.12.10"

lazy val core = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0")

lazy val child = project
  .settings(dependencyOverrides += "org.typelevel" %% "cats-effect" % "1.4.0")
  .dependsOn(core)