package com.java.method;

import java.util.Scanner;

class Hello2
{
 
	boolean isdigit(char ch)
	{
	  if (ch>='0' && ch<='9') 
	  {
         return true;	 
	  }
	  else 
	  {
         return false;		
	  }
   }
}
		
	  
   

public class Test1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter digit or alphabetse ");
		Hello2 h=new Hello2();
		char ch=sc.next().charAt(0);
		boolean flag=false;
		flag=h.isdigit(ch);
		if (flag) 
		{
			System.out.println("hi user welcome");
			
		} 
		else 
		{
			System.out.println("bye user");

		}
		

	}

}
