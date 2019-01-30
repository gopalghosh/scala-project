
package com.test

import java.text.Normalizer.Form

object Test {
  val s="gopal";
  var i=10;
  def main(args: Array[String]) {
    println("gdygdc"+s+i*i)
    println(test())
    while(i<20){
      println(i);
      i=i+1;
    }
    for( a <- 1 to 10){
         println( "Value of a: " + a );
      }
  }
  def test() : Float={
    return i+i;
  }
}