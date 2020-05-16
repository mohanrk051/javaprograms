package com.java.singleton;

class Hello
{   private static Hello h=new Hello();
	private Hello() 
	{
		System.out.println(" default constructor ");
	}
	
	 public static  Hello getHello() 
	 {
		 return h;		
	}
}
public class Singleton2 
{
	

	public static void main(String[] args) 
	{
		Hello h1=Hello.getHello();
		Hello h2=Hello.getHello();
		Hello h3=Hello.getHello();
		System.out.println("internally called runtime class");

	}

}
