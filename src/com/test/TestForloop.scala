package com.test

object TestForloop {
  
  def main(args: Array[String]): Unit = {
    val list=List("Monday", "TuesDay", "Wednesday", "ThursDay","Friday", "Saturday", "Sunday")
    val x=for(str <- list) yield{
      str match{
        case "Monday"=>"Maniac day"
        case otherDay=>otherDay
      }
    }
    
    println(x)
  }
}