package com.example

/**
  * Created by jiang on 16/2/1.
  */



import rx.lang.scala._
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

//import org.apache.commons.io.monitor._




trait Logging{
    def log(s:String)
    def warn(s:String) =log("Warn: "+s)
    def error(s:String) = log("Error:" +s)
}

object ObservablesItems extends App with Logging {
    override def log(s: String) = println(s)

    //    val o = Observable.items("Pascal","Java","Scala")
    //    o.subscribe(p=>println("learn :" + p))
    //    o.subscribe(p=>println("forget :" + p))

    //    val o = Observable.timer(1.second)
    //    o.subscribe(_=>println("Timeout!!"))
    //    o.subscribe(_=>println("Another Timeout"))
    //    Thread.sleep(3000)

    //    val exc = new RuntimeException
    //
    //    val o = Observable.items(1,2) ++ Observable.error(exc)
    //    o.subscribe(
    //        x => println("number:"+x),
    //        t => println("error:" + t)
    //    )
    //    val classiscs = List("Good , bad , ugly","Titanic","Die Hard")
    //    val movies = Observable.from(classiscs)
    //    val vms = Observable.create[String]{ obs =>
    //    obs.onNext("JVM")
    //    obs.onNext("DartJVM")
    //    obs.onNext("V8")
    //    obs.onCompleted()
    //    Subscription()
    //}
    //  vms.subscribe(log _, e =>log(s"oops - $e"),()=>log("Done!"))

    //    val f = Future("Back to the Future(s)")
    //    val o = Observable.create[String]{ obs =>
    //        f.foreach{case s =>obs.onNext(s);obs.onCompleted()}
    //        f.failed.foreach{case t =>obs.onError(t)}
    //        Subscription()
    //
    //    }
    //    o.subscribe(println(_))


    //  Observable.from(Future("Hello World")).subscribe(println(_))


//    val odds = Observable.interval(0.5.seconds).filter(_ % 2 == 1).map(n => s"number $n").take(5)
//    odds.subscribe(println(_),e=>println(e.getCause),()=>println("no more data"))
//
//    Thread.sleep(5000)

    val event = for(n<-Observable.from(0 to 10);if n %2 ==0) yield s"eventNum $n"
    event.subscribe(println(_))


}


