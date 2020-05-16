package com.java.staticimport;
import static com.java.staticimport.Hello.*;
public class Test
{
	static int x=12;

	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(Hello.a);
		Hello.m1();
		System.out.println(a);
		m1();

	}
	
	static void m2()
	{
		System.out.println("static m2()-test com.java.staticimport ");
	}

}
