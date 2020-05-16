package com.java.method;

import java.util.Scanner;

class Hello4
{
	void register()
	{
		System.out.println("welcome to registration");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 'Y' to continue else 'N'");
		char ch=sc.next().charAt(0);
		if (ch=='N')
		{
			return;
			
		}
		System.out.println("enter name:");
		String name=sc.next();
		
		System.out.println("enter email:");
		String email=sc.next();
		
		System.out.println("enter phone:");
		long phone=sc.nextLong();
		
		System.out.println("thank you "+ name+" for registration");
		
		
		
	}
}
public class Test3 
{
	

	public static void main(String[] args)
	{
		Hello4 h=new Hello4();
		h.register();
		System.out.println("main method ends");

	}

}
