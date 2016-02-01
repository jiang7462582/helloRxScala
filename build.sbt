name := """helloRxScala"""

version := "1.0"

scalaVersion := "2.10.4"


libraryDependencies += "com.netflix.rxjava" % "rxjava-scala" % "0.19.1"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"



// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

