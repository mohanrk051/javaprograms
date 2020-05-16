package com.innerclass;

public class MethodLocalOuter 
{
	public void m1()
	{
	  class Inner
	  {
		  
		public void sum(int x,int y)
		{
			System.out.println("sum of x and y is "+(x+y));
		}
	  }
	  
	  Inner i=new Inner();
	  i.sum(10, 10);
	  i.sum(100,200);
	  
	}
	
	public static void main(String[] args) 
	{
		MethodLocalOuter m=new MethodLocalOuter();
		m.m1();
		
	}
	
}
