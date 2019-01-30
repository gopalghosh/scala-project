package com.test

import Array._

object ConcatenateArray {
  
  def main(args: Array[String]){
    var list1=Array(1, 2, 3, 4,5);
    var list2=Array(6, 7, 8, 9,10);
    var list3=concat(list1,list2);
    
    for(i<-0 to list3.length-1)
      println(list3(i))
      
     var list4=range(10,20,2);
      
      for(i<-list4)
      println(i)
  }
}