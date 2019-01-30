package com.test

class Point1(x:Int, y:Int) extends EqualTrait{
  var x1=x;
  var y1=y;
  def isEquals(obj:Any)=obj.isInstanceOf[Point1] && obj.asInstanceOf[Point1].x1 == y1
}