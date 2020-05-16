package com.java.exception;

public class AIOBE {

	public static void main(String[] args) 
	{
		try
		{
		  int a[]=new int[4];
		  a[5]=9;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds");
		}

	}

}
