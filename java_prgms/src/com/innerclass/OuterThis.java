package com.innerclass;

public class OuterThis 
{
	int x=10;
	
     class Inner
	{
		int x=100;
		
		public void m1()
		{
			int x=1000;
			System.out.println(x); //1000
			System.out.println(this.x);//100
			System.out.println(OuterThis.this.x);//10
		}
		
	}

	public static void main(String[] args)
	{
		new OuterThis().new Inner().m1();
		
		

	}

}
