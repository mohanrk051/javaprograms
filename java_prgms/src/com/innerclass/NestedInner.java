package com.innerclass;

 class A 
{
	class B
	{
		class c
		{
			public void m1()
			{
				System.out.println("inner class C method");
			}
		}
	}

}

public class NestedInner
{
	public static void main(String[] args) 
	{
		new A().new B().new c().m1();
		
		
	}
}