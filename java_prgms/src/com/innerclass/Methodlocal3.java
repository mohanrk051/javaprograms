package com.innerclass;


public class Methodlocal3
{
	
	
	public void m1()
	{
		final int x=15;
		
		class Inner
		{
			public  void m2()
			{
			System.out.println(x);
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
