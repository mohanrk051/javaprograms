package com.java.constructor;

class Customer    //using method 
{
	int cid;
	String cname;
	long cphone;

void show()
{
	
	System.out.println("cid "+ cid +"\n"+"cname "  + cname+"\n"+"cphone "+cphone+"\n");
}
}
public class Test1 
{

	public static void main(String[] args) 
	{  
		System.out.println("customer info");
		System.out.println("---------------");
		Customer c1=new Customer();
		c1.cid=101;
		c1.cname="mohan";
		c1.cphone=99873737;
		c1.show();
		
		Customer c2=new Customer();
		c2.cid=102;
		c2.cname="srini";
		c2.cphone=99874437;
		c2.show();
		

	}

}
