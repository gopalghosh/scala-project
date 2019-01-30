package com.test

object BubbleSort {
  
  def main(args:Array[String]){
    var arr=Array(1,45,34,67,21,5);
    var i=0;
    var j=0;
    for(i<-0 to arr.length-1){
      for(j<-i+1 to arr.length-1){
        if(arr(j)>arr(i)){
          val temp=arr(i);
          arr(i)=arr(j);
          arr(j)=temp;
        }
      }
    }
    for(k<-0 to arr.length-1){
    println(arr(k))
  }
  }
}