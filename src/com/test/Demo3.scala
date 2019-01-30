package com.test

object Demo3 {
   def main(args:Array[String]){
     val p1 = new Point1(2, 3)
      val p2 = new Point1(2, 4)
      val p3 = new Point1(3, 3)

      println(p1.isEquals(p2))
      println(p1.isEquals(p3))
   }
}