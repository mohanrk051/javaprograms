package com.lang.object;

class Customer
{
	int cid;
	String cname;
	public Customer(int cid, String cname) 
	{
		this.cid = cid;
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cid+"\t"+cname;
	}
	
	@Override
	public boolean equals(Object obj) 
	{   
		Customer c =(Customer)obj;
		return this.cid==cid;
	}
}
public class Equals 
{

	public static void main(String[] args) 
	{
		Customer c1=new Customer(10,"mohan");
		Customer c2=new Customer(11,"raj");
		Customer c3=new Customer(11,"kavya");
		Customer c4=new Customer(10,"indra");
		Customer c5=c1;
		System.out.println(c1);
		System.out.println(c2);
		/*System.out.println(c1==c2);
		System.out.println(c1==c5);
		System.out.println(c1.equals(c5));*/
		/*System.out.println(c1==c4);
		System.out.println(c1.equals(c4));  *///false 
		
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		System.out.println(c1==c4);
		System.out.println(c2==c3);

	}

}
