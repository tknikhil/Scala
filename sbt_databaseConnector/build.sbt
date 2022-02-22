

/*ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

ThisBuild/name:="sbt_databaseConnector"*/


lazy val root = (project in file("."))
  .settings(
    name := "sbt_databaseConnector",
    scalaVersion := "2.13.8",
    version := "0.1.0-SNAPSHOT",
    scalacOptions ++= Seq("-unchecked", "-deprecation"),
    dependencyOverrides ++=Seq("org.scalaz" %% "scalaz-core" % "7.3.6","org.scalaz" %% "scalaz-http" % "7.3.6"),
    libraryDependencies ++= Seq(
      /*"org.scalaz" %% "scalaz-core" % "7.3.6",
      "org.scalaz" %% "scalaz-http" % "7.3.6",*/
      "org.eclipse.jetty" % "jetty-servlet" % "7.3.0.v20110203" % "container",
      "org.eclipse.jetty" % "jetty-webapp" % "7.3.0.v20110203" % "test,container",
      "org.eclipse.jetty" % "jetty-server" % "7.3.0.v20110203" % "container",
      "com.h2database" % "h2" % "1.2.137",
      "org.squeryl" % "squeryl_2.10" % "0.9.5-6"
    )
    seq(com.github.siasia.WebPlugin.webSettings:_*)
  )
