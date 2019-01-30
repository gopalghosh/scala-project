package com.test.search

object TestBS {
  
  def main(args:Array[String]){
    var bs=new BinarySearch();
    var arr=Array(1,2,3,5,6,7,8,9);
    println(bs.searchElement1(arr, 5, 0, arr.length-1))
  }
  
}