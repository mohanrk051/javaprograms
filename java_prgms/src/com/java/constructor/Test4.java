package com.java.constructor;

class Customer4
{
	int cid;
	String cname;
	long cphone;
	
	Customer4()
	{
		System.out.println("default constructor");
		
	}
	
	Customer4(int id)
	{
		System.out.println("1 arg constructor");
		cid=id;
		System.out.println("cid ->"+cid);
		
	}

	Customer4(int id,String nm)
	{
		System.out.println("2 arg constructor");
		cid=id;
		cname=nm;
		System.out.println("cid ->"+cid+"\n"+" cname -> "+ nm);
	}
	
	Customer4(int id,String nm,long ph)
	{
		System.out.println("3 arg constructor");
		cid=id;
		cname=nm;
		cphone=ph;
		System.out.println("cid ->"+cid+"\n"+"cname ->"+nm+"\n"+"cphone-> "+ph);
	}
}
public class Test4 {

	public static void main(String[] args) 
	{
		Customer4 c=new Customer4();
		System.out.println("--------------------");
		Customer4 c1=new Customer4(101);
		System.out.println("--------------------");
		Customer4 c2=new Customer4(101,"mohan");
		System.out.println("--------------------");
		Customer4 c3=new Customer4(101,"mohan",98764644);
	}

}
