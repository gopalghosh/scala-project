package com.test


 object Test1 {
  def main(args: Array[String]){
    /*for( a <- 1 to 3; b <- 1 to 3){
         println( "Value of a: " + a );
         println( "Value of b: " + b );
      }*/
   // var p=new Loaction(10,20,30);
   // println(p.move(20,30));
     var loc = new Location(10, 20, 15);

      // Move to a new location
      loc.move(10, 10, 5);
  }
  
}