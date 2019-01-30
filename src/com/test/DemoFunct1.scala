package com.test

object DemoFunct1 {
  def main(args: Array[String]) {
        delayed(time());
        println(addInt(2,3))
        println(">>>>>"+multiplier(1))
        print("greeting"+greeting);
   }

   def time() = {
      println("Getting time in nano seconds")
      System.nanoTime
   }
   def delayed( t: Long ) = {
      println("In delayed method")
      println("Param: " + t)
   }
   
    def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
    
     var factor = 3
   val multiplier = (i:Int) => i * factor
   val greeting: String = "Hello, world!";
   
   {
     println(greeting.length())
   }
}