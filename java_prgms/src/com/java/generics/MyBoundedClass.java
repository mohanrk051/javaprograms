package com.java.generics;

public class MyBoundedClass {

	public static void main(String[] args)
	{
		BoundEX<C> c=new BoundEX(new C());
		c.doRun();
		BoundEX<B> b=new BoundEX(new B());
		b.doRun();
		BoundEX<A> a=new BoundEX(new A());
		a.doRun();

	}

}


class BoundEX<T extends A>
{
	private T objref;

	public BoundEX(T objref) {
		super();
		this.objref = objref;
	}
	void doRun()
	{
		objref.printClass();
	}
	
}

class A
{
	public void printClass()
	{
		System.out.println("im in superclass A");
	}
}
class B extends A
{
	public void printClass()
	{
		System.out.println("im in subclass B");
	}
	
}

class C extends A
{
	public void printClass()
	{
		System.out.println("im in subclass C");
	}
	
}