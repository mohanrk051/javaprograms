package com.java.exception;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

public class Throw2_exce_after_statement {

	public static void main(String[] args) 
	{
		/*System.out.println(10/0);
		System.out.println("hello");*/
		
		throw new  ArithmeticException("/ by zero");
		//System.out.println("hello");  //after throw exception raised code became unreachable it gives CTE

	}

}
