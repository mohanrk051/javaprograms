 
 package com.java.constructor;
 
 class Test5
{
 Test5()
 {
  this(10);
 }
 Test5(int x)
 {
  System.out.println("x="+x);
 }
public static void main(String arg[])
{
Test5 object = new Test5();
}
}