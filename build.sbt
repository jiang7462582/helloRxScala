name := """helloRxScala"""

version := "1.0"

scalaVersion := "2.11.6"





libraryDependencies += "com.netflix.rxjava" % "rxjava-scala" % "0.19.1"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

//// Change this to another test framework if you prefer
//libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.apache.commons" % "commons-io" % "1.3.2"



// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }