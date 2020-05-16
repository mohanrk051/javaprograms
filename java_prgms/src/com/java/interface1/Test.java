package com.java.interface1;

interface Inter1
{
	int a=11;
	public static final int b=30;
	/*void m1()    not allowed concrete methods 
	{}*/
	void m1();
	public abstract void m2();
}

class InterImpl implements Inter1
{
  //int a=88;
	@Override
	public void m1() 
	{
		System.out.println("m1()-implemented Inter1");
	}

	@Override
	public void m2()
	{
		System.out.println("m2()-implemented Inter1");
		
	}
	//private void m3();
	
}
public class Test 
{
	

	public static void main(String[] args) 
	{
		System.out.println(Inter1.a);
		System.out.println(Inter1.b);
		Inter1 in=new InterImpl();
		in.m1();
		in.m2();
		InterImpl in1=new InterImpl();
		System.out.println("in1 interimpl "+in1.a);
	}

}
