package com.java.staticinnerclass;

class Outer
{
	int a=10;
	static int b=20;
	
	static class Inner
	{   
		int c=30;
		static int d=40;
		void m1()
		{
			System.out.println("static inner -m1()");
			//System.out.println("a="+a);  //cant acess instance variable of  inside outer class
			System.out.println("b="+b);
			System.out.println("c="+c);
			System.out.println("d="+d);
		}
	}
	void m2()
	{
		System.out.println("m2()-outer class method");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//System.out.println("c="+c);  not  allowed static inner class members inside outer class  so use
		System.out.println("new inner c="+new Inner().c);
		System.out.println("d static inner clas  var "+Inner.d);
	}
}
public class Test {

	public static void main(String[] args) 
	{
		Outer.Inner oin_obj=new Outer.Inner();
		oin_obj.m1();
		Outer o=new Outer();
		o.m2();

	}

}
