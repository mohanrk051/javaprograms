package com.java.wrapper;

import java.util.ArrayList;

public class Wrap 
{
	int x;

	

	public static void main(String[] args)
	{
		Object obj=123;
		Object obj1=true;
		Object obj2="mohan";
		
		int num=34;
		Integer in=Integer.valueOf(num);
		System.out.println("num"+num);
				
		
		ArrayList al=new ArrayList();
		//al.add(x);
		Integer a=10;
		a.toString();
		//System.out.println(a);
		int a1;
		Integer y=a;
		Integer z=new Integer(a);
		//System.out.println(z);
		//int m=z; 
		int m=z.intValue();
		System.out.println(m);
		
		
		
		

	}

}
