package com.innerclass;

public class RegularInner_outer
{
	int x=12;
	static int y=44;
	
	class Inner
	{
		public void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
		
	}

	public static void main(String[] args) 
	{
		
		new RegularInner_outer().new Inner().m1();

	}

}
