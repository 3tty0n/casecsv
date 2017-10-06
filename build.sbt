name := "casecsv"

version := "0.1.0"

scalaVersion := "2.12.3"

crossScalaVersions := Seq("2.11.11", "2.12.3")

scalacOptions ++= Seq("-feature", "-deprecation","-Xlog-implicits")

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots")
)

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.2",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)
