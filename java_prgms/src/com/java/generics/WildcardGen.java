package com.java.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WildcardGen {

	public static void arithmeticcalaculations(List<? extends calculations>listobj)
	{
		Iterator it=listobj.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		
	}
	public static void main(String[] args) 
	{
		List< Addition> l1=new ArrayList();
		Addition a=new Addition();
		a.calculate(10, 20);
		l1.add(a);
		System.out.println("adress of "+l1);
		
		/*
		 * List<Substraction> l2=new ArrayList(); Substraction sub=new Substraction();
		 * sub.calculate(30, 10); l2.add(sub);
		 */
	}

}

abstract class calculations
{
	abstract void calculate(int a ,int b);
}

class Addition extends calculations
{
	@Override
	void calculate(int a, int b) 
	{
		int add=a+b;
		System.out.println("addition is "+add);
	}
}

class Substraction extends calculations
{
	@Override
	void calculate(int a, int b) 
	{
		int sub=a-b;
		System.out.println("substraction is "+sub);
	}
}