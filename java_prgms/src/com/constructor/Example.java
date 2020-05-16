package com.constructor;

public class Example 
{
	  Example()
	{
		System.out.println("constructor example()");
	}
	 
	 int Example()
		{
			System.out.println("method Example");
			return 1;
		}

	
public static void main(String[] args) 
{
	
	Example e=new Example();
	//e.Example();
	
	
}
}
