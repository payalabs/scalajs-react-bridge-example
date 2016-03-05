enablePlugins(ScalaJSPlugin)

organization := "com.payalabs"
name := "scalajs-react-bridge-example"
version := "0.3.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val scalaJsDom = "0.8.2"
  val scalaJsReact = "0.10.0"
  Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.scala-js" %%% "scalajs-dom" % scalaJsDom,
    "com.github.japgolly.scalajs-react" %%% "core" % scalaJsReact,
    "com.github.japgolly.scalajs-react" %%% "extra" % scalaJsReact,
    "com.payalabs" %%% "scalajs-react-bridge" % "0.3.0-SNAPSHOT"
  )
}

resolvers += Resolver.sonatypeRepo("snapshots")
