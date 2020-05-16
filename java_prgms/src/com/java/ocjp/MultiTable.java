package com.java.ocjp;

import java.util.Scanner;

//Write a Program which generates a multiplication table for a given no

class Multiply
{
	int n;
void dec(int x)
{
	n=x;
}
void cal()
{
	for(int i=1;i<=10;i++)
	{
	System.out.println(n+"*"+i+"="+n*i);
	}
}
}
 public class MultiTable
{
	public static void main(String args[])
	{
		
			if(args.length!=1)
		{
				//Scanner sc=new Scanner(System.in);
			System.out.println("Please give one value");
		}
		else
		{
			int x=Integer.parseInt(args[0]);
			if(x<0)
			{
				System.out.println("Please give positive number");
			}
				else
			{
					Multiply mo = new Multiply();
					mo.dec(x);
					mo.cal();
			}
		}
}
}


