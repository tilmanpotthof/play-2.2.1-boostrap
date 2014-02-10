name := "play-bootstrap"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

play.Keys.lessEntryPoints <<= baseDirectory { base =>
   (base / "app" / "assets" / "stylesheets" / "bootstrap" * "bootstrap.less") +++
   (base / "app" / "assets" / "stylesheets" / "bootstrap" * "responsive.less") +++
   (base / "app" / "assets" / "stylesheets" * "*.less")
}