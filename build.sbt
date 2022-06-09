scalaVersion := "2.13.8"
organizationName := "dev.zio"
version := "0.0.1"

lazy val zio_foo_tutorial = project
  .in(file("documentation/zio-docs-foo-tutorial"))
  .settings(BuildHelper.mdocSettings("docs", "foo"))
  .enablePlugins(MdocPlugin)

lazy val zio_bar_tutorial = project
  .in(file("documentation/zio-docs-bar-tutorial"))
  .settings(BuildHelper.mdocSettings("docs", "bar"))
  .enablePlugins(MdocPlugin)

lazy val nested = project in file("documentation") aggregate (zio_foo_tutorial, zio_bar_tutorial)
