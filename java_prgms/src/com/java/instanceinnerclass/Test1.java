package com.java.instanceinnerclass;

class Outer
{
	int a=10;
	static int b=20;
	
	class Inner
	{
		int a=50;
		int c=30;
		//static int d=40; //not allowed static variable inside instance inner class
		void m1()
		{   int a=60;
			System.out.println("m1()-Inner");
			System.out.println(a);
			System.out.println(this.a); //instance variable acessed ie 50
			System.out.println(b);  //20
			System.out.println(c);  //30
	        System.out.println(" new outer a "+new Outer().a );  //acess outer class variable in m1()
		}
	}
	void m2()
	{
		System.out.println("m2()-outer class method");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//System.out.println("c="+c);     cant able to use inner class variable outise a outer class method 
		                               //so create a object use it
		Inner in1=new Inner();
		System.out.println("inner class variable c "+in1.c);  //30
		System.out.println("inner class variable a "+in1.a);  //50
		System.out.println("inner class variable a "+this.a);  //10
		in1.m1();
		
	}
}
public class Test1 {

	public static void main(String[] args) 
	{
		Outer.Inner oin_obj=new Outer(). new Inner();
		//oin_obj.m1();
		Outer o=new Outer();
		o.m2();
		
		
	}

}
