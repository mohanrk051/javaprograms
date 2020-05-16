package com.java.blocks;

public class H 
{
	static int i=10;
	
	static
	{
		i=20;
	}

	public static void main(String[] args) 
	{
 
		System.out.println("main"+i);
	}

}
