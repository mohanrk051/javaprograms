package com.java.blocks;

public class J {
 
	static int i;
	static int j=10;
	
	static
	{
		System.out.println("SIB-T  "+i);
		System.out.println("SIB-Q  "+j);
		i=20;
		
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(j);
		System.out.println("main end");

	}

}
