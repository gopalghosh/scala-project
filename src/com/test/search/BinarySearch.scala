package com.test.search

class BinarySearch {
  
  def searchElement1(arr:Array[Int], searchElement:Int, low:Int , high:Int):Int={
    if(low>high)
      -1
    else{
     var mid=(high+low)/2;
     if(arr(mid)==searchElement){
       println("Element found"+mid);
       mid;
     }else if(searchElement>arr(mid)){
     return searchElement1(arr, searchElement,(mid+1),high);
     }else{
       return searchElement1(arr, searchElement,low,mid-1);
     }
    }
    
  }
  
  
}