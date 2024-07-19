import Dependencies._

name := "sangria-pekko-http-circe"
organization := "org.sangria-graphql"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "com.github.pjfanning" %% "pekko-http-circe" % "2.6.0",
  "org.sangria-graphql" %% "sangria-circe" % SangriaVersion.sangriaCirce,
  "org.apache.pekko" %% "pekko-http" % pekkoHttpVersion % Test,
  "org.apache.pekko" %% "pekko-stream-testkit" % pekkoVersion % Test,
  "org.apache.pekko" %% "pekko-http-testkit" % pekkoHttpVersion % Test,
  "io.circe" %% "circe-optics" % circeOpticsVersion % Test
)
