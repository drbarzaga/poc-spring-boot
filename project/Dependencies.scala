import sbt._

object Dependencies {

  object Versions {
    val cats         = "2.1.0"
    val catsEffect   = "2.1.1"
    val scalaTest    = "3.1.0"
    val logback      = "1.2.3"
    val springBoot   = "2.0.4.RELEASE"
    val jacksonScala = "2.10.3"
    val mockitoScala = "1.11.4"
  }

  object Libraries {

    def springBoot(artifact: String): ModuleID = "org.springframework.boot" % artifact % Versions.springBoot

    val springBootStarterWeb = springBoot("spring-boot-starter-web")
    val cats                 = "org.typelevel" %% "cats-core" % Versions.cats
    val catsEffect           = "org.typelevel" %% "cats-effect" % Versions.catsEffect
    val logbackClassic       = "ch.qos.logback" % "logback-classic" % Versions.logback
    val scalaTest            = "org.scalatest" %% "scalatest" % Versions.scalaTest % Test
    val jacksonScala         = "com.fasterxml.jackson.module" %% "jackson-module-scala" % Versions.jacksonScala
    val mockitoScala         = "org.mockito" %% "mockito-scala" % Versions.mockitoScala % Test

  }
}
