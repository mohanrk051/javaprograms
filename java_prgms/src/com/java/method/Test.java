package com.java.method;

import java.util.Scanner;

// example on return type
class Hello1
{
	void add (int a,int b)
	{
		System.out.println("add()");
		int res=a+b;
		System.out.println("add() "+res);
	}
	/*int sum(int a ,int b)
	{
		System.out.println("sum()");
		int res=a+b;
		System.out.println("sum()sum"+res);
		return res;
	}*/
	  int  sum(int a ,int b)
	  {
		System.out.println("sum()");
		int res=a+b;
		System.out.println("sum()sum"+res);
		return res;
	  }
	
	void  isDigit(char ch)
	{
		if (ch>='0' && ch<='9') 
		{
			System.out.println("digit");
			
		} 
		else 
		{ 
			System.out.println("is not digit");

		}
	}
}
public class Test {

	public static void main(String[] args) 
	{  
		  
     // int res=0;
	  Hello1 h=new Hello1();
	  h.add(10, 15);
	  h.sum(12, 12);
//	  System.out.println("res"+(res+5));
	  h.isDigit('8');
	  
	}

}
