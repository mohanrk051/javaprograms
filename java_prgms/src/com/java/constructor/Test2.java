package com.java.constructor;

import java.util.Scanner;


class Customer1
{
	int cid;
	String cname;
	long cphone;


{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a customer info");
	
	System.out.println(" 1.Enter a cust id");

	cid=sc.nextInt();
	
	System.out.println(" 2.enter a custname");

	cname=sc.next();
	
	System.out.println(" 3.enter a custphone");

	cphone=sc.nextLong();
}
void show()
{ 
	System.out.println(" cid "+ cid +"\n"+" enter cname "  + cname+"\n"+
			" enter cphone "+cphone+"\n");
	
}

}
public class Test2 
{

	public static void main(String[] args)
	{

		Customer1 c1=new Customer1();
		c1.show();
		Customer1 c2=new Customer1();
		c2.show();
		Customer1 c3=new Customer1();
		c3.show();
		
	}

}
