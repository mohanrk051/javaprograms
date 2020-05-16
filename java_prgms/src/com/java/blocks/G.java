package com.java.blocks;

public class G
{ 
	static int i=10;
	
	static
	{
		System.out.println("static "+i);
	}

	public static void main(String[] args)
	{
		System.out.println("main "+i);

	}

}
