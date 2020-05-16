package com.java.exception;

public class Exception1
{

	public static void main(String[] args) 
	{
		try 
		{
		String val1=args[0]; //passing a value during runtime
		System.out.println(val1);  //not provide anyvalue means got AIOBE
		int i=Integer.parseInt(val1); //pass any string its gives NFE
		double d= 10/ i; //arithmetic exception divided by zero 
		
		 String str="beginnerjava";
		 System.out.println(str.length());;
		 char c = str.charAt(0);
		 c = str.charAt(40);  //string out of bound exception
		 System.out.println(c);
		 
		 String str1=null;
			System.out.println (str1.length());
		}
		catch (Exception e)
		{
			System.out.println("handled exception");
			// TODO: handle exception
		}
	}

}
