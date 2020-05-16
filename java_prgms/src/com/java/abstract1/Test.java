package com.java.abstract1;
import static java.lang.System.out;

abstract class Hello
{
	int a=11;
	 void m1()
	{
		out.println("m1()-hello");
	}
	abstract void m2();
}
class Hai extends Hello
{ 
	int x=20;
	int a=99;

	void m1()
	{
		out.println("m1()-hai");
	}
	void m2() 
	{
		out.println("m2()-Hai class implemented ");
		
	}
	void m3()
	{
		System.out.println("m3()-hai class");
	}
	void m4()
	{
		System.out.println("m4()-hai class");
	}
	
}
public class Test {

	public static void main(String[] args)
	{
		//Hai hai=new Hai();
		/*System.out.println(hai.a);
		System.out.println(hai.x);
		hai.m2();
		hai.m1();*/
		
		//dynamic dispatch
		Hello h=new Hai();
		System.out.println(h.a);
		h.m1();
		h.m2();
		//h.m3();  child methid cant called in super class reference 
		//h.m4();

	}

}
