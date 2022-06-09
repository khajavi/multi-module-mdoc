scalaVersion := "2.13.8"
organizationName := "dev.zio"
version := "0.0.1"

lazy val zio_foo_tutorial = project
  .in(file("documentation/zio-docs-foo-tutorial"))
  .enablePlugins(MdocPlugin)
  .settings(
    libraryDependencies += "org.scalameta" %% "mdoc" % "2.3.2",
    mdocIn := baseDirectory.value / "docs",
    mdocOut := (LocalRootProject / baseDirectory).value / "website" / "docs"
  )

lazy val zio_bar_tutorial = project
  .in(file("documentation/zio-docs-bar-tutorial"))
  .enablePlugins(MdocPlugin)
  .settings(
    libraryDependencies += "org.scalameta" %% "mdoc" % "2.3.2",
    mdocIn := baseDirectory.value / "docs",
    mdocOut := (LocalRootProject / baseDirectory).value / "website" / "docs"
  )

lazy val nested = project in file("documentation") aggregate (zio_foo_tutorial, zio_bar_tutorial)