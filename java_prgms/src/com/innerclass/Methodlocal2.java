package com.innerclass;

public class Methodlocal2
{
	static int x=10;
	static int y=50;
	
	public static void m1()
	{
		class Inner
		{
			public static void m2()
			{
			System.out.println(x);
			System.out.println(y);
			}
			
		}
		Inner i=new Inner();
		i.m2();
		
		
	}
	public static void main(String[] args) 
	{
		Methodlocal2 m=new Methodlocal2();
		m.m1();
		
	}
	
	

}
