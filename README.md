To execute:
`child/run`

Following configuration fails with `java.lang.NoSuchMethodError: cats.effect.ContextShift.$init$(Lcats/effect/ContextShift;)V`:
```scala
lazy val core = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0")

lazy val child = project
  .settings(dependencyOverrides += "org.typelevel" %% "cats-effect" % "1.4.0")
  .dependsOn(core)
```

Different combinations work:

```scala
lazy val core = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "1.4.0")

lazy val child = project
  .settings(dependencyOverrides += "org.typelevel" %% "cats-effect" % "2.0.0")
  .dependsOn(core)
```

```scala
lazy val core = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "1.4.0")

lazy val child = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0")
  .dependsOn(core)
```

```scala
lazy val core = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0")

lazy val child = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "1.4.0")
  .dependsOn(core)
```
