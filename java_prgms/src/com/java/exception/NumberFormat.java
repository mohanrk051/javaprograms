package com.java.exception;

public class NumberFormat {

	public static void main(String[] args) 
	{
		try
		{
		  /*String s="mohan";
		    int a1=Integer.parseInt(a1);*/
         
		    int a=Integer.parseInt("mohan");
		    System.out.println(a);
		}
		catch (NumberFormatException e) 
		{
			System.out.println("cant pass string value in integer");
		}
	}

}
