package com.java.constructor;

class Customer3
{
	int cid;
	String cname;
	long cphone;
	public Customer3(int id, String nm, long ph) {
		this.cid = id;
		this.cname = nm;
		this.cphone = ph;
	}
	
	void show()
	{ 
		System.out.println(" cid "+ cid +"\n"+" enter cname "  + cname+"\n"+
				" enter cphone "+cphone+"\n");
		
	}
	
}


public class Test3
{

	public static void main(String[] args)
	{
		
		Customer3 customer1=new Customer3(101,"mohan",3243434);
		customer1.show();
		Customer3 customer2=new Customer3(102,"soumya",9843434);
		customer2.show();
		Customer3 customer3=new Customer3(103,"mithun",88243434);
		customer3.show();
	}

}
