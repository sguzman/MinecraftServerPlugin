/** Name of project */
name := "MinecraftServerPlugin"

/** Organization */
organization := "com.github.sguzman"

/** Project Version */
version := "1.0"

/** Scala version */
scalaVersion := "2.12.4"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case _ => MergeStrategy.first
}

/** Scalac parameters */
scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

/** Javac parameters */
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

/** Resolver */
resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Search Maven" at "https://repo1.maven.org/maven2/",
  "Spigot Repo" at "https://hub.spigotmc.org/nexus/content/repositories/snapshots/",
  "Sona Type" at "https://oss.sonatype.org/content/repositories/snapshots/"
)

/** Source Dependencies */
libraryDependencies ++= Seq(
  "org.spigotmc" % "spigot-api" % "1.11.2-R0.1-SNAPSHOT"
)

/** Make sure to fork on run */
fork in run := true