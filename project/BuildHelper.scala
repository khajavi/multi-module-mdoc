import sbt._
import sbt.Keys._
import mdoc.MdocPlugin
import MdocPlugin.autoImport._

object BuildHelper {

  def mdocSettings(docsDir: String, outDir: String) = Seq[sbt.Def.Setting[_]](
    libraryDependencies += "org.scalameta" %% "mdoc" % "2.3.2",
    mdocIn := baseDirectory.value / docsDir,
    mdocOut := (LocalRootProject / target).value / "mdoc" / outDir
  )
}
