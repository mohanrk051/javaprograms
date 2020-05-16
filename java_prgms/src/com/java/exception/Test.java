package com.java.exception;

class Test extends RuntimeException  
{

	public static void main(String[] args)
	{
		//System.out.println(10/0);  //internally called exception object to jvm
		
		// now exlpicitly calling 
       // throw new ArithmeticException("/ by zero explicitly");
       //  System.out.println("hello"); its become unreachable code
		//throw new Test(); //no exception of type test can thrown
		
		throw new Test ();
		
	}

}
