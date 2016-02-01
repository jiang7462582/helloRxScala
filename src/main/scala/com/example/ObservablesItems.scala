package com.example

/**
  * Created by jiang on 16/2/1.
  */




import rx.lang.scala._
import scala.concurrent.duration._
object ObservablesItems extends App{
//    val o = Observable.items("Pascal","Java","Scala")
//    o.subscribe(p=>println("learn :" + p))
//    o.subscribe(p=>println("forget :" + p))

    val o = Observable.timer(5.second)
    o.subscribe(_=>println("Timeout!!"))
    o.subscribe(_=>println("Another Timeout"))
    println("begin")
    Thread.sleep(6000)
    println("end")


}
