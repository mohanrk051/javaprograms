package com.java.exception;

public class StringIndexOutOfBound {

	public static void main(String[] args) 
	{
		try
		{ 
		String str="mohan going to movie";
		int a=str.length();
		System.out.println(a);
		char c=str.charAt(20);
		System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBound exception pass  the charecter within  the range ");
		}
		

	}

}
