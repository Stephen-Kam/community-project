import play.core.PlayVersion

name := "community-project"

version := "0.1"

scalaVersion := "2.12.7"

val cucumberVersion = "2.0.1"

libraryDependencies ++= Seq(
  "io.cucumber"             %%  "cucumber-scala"  % cucumberVersion,
  "io.cucumber"             %   "cucumber-junit"  % cucumberVersion,
  "org.scalatest"           %%  "scalatest"       % "3.2.0-SNAP10",
  "org.seleniumhq.selenium" %   "selenium-java"   % "3.14.0",
  "org.scalacheck"          %%  "scalacheck"      % "1.14.0",
  "com.typesafe.play"       %%  "play-test"       % PlayVersion.current
)
