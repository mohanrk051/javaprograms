package com.java.method;


//Firstly create a class Instance and call the non-static method using that instance in static method. e.g,

public class Hello
{
	static int i=10;
	public void add(int x,int y)
	{
		int a=x;
		int b=y;
		int c=a+b;
		System.out.println("sum of two values is  "+c);
	}
	
	public static void smethod()
	{
		
		i=20;
		System.out.println("i smethod="+i);
	}
	

	public static void main(String[] args) 
	{
		Hello h=new Hello();
		h.add(12, 2); //calling non-static method inside a static  create a object with help of ref var access it
		System.out.println("i value"+i);
		h.smethod();
		Hello h1=null;
		h1.smethod();
		smethod();
		
	}
	
}
