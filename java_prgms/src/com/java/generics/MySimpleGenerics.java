package com.java.generics;

public class MySimpleGenerics {

	public static void main(String[] args)
	{
		SimpleGenerics<String> str=new SimpleGenerics(" New Generics");
		str.printType();
		SimpleGenerics<Boolean> bol=new SimpleGenerics(Boolean.TRUE);
		bol.printType();
		

	}

}

class SimpleGenerics <T>
{
	T objreff;

	public SimpleGenerics(T objreff) {
		super();
		this.objreff = objreff;
	}
	
	/*
	 * public T getObjectReff() { return objreff; }
	 */
	
	public void printType()
	{
		System.out.println("Type: "+objreff.getClass().getName());
	}
	
}