organization := "com.lunatech"

name := "specs2-mongo"

description := "Tools that allow specs2 tests to use their own MongoDB instance"

crossScalaVersions := Seq("2.10.5", "2.11.6")

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.6" % "provided",
  "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "1.47.3"
)

publishTo  := {
  val artifactory = "http://artifactory.lunatech.com/artifactory/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("releases" at artifactory + "snapshots-public")
  else
    Some("snapshots" at artifactory + "releases-public")
}

releaseSettings
