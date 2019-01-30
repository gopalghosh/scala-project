package com.test
import Run._

object Demo {
  def main(args: Array[String]) {
      10 times printVal()
   }
  
  def printVal(){
    val i=10;
    val j=20;
    println("hello"+i*j);
  }
}