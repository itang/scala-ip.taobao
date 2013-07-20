name := "scala-ip.taobao"
 
version := "1.0"
 
scalaVersion := "2.10.2"

libraryDependencies ++= Seq(
  //"com.propensive" % "rapture-io" % "0.8.0" from "http://rapture.io/download/io-0.8.0.jar",
  "net.liftweb" % "lift-json_2.10" % "2.5.1",
  //"org.specs2" %% "specs2" % "2.1" % "test",
  "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
)

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)