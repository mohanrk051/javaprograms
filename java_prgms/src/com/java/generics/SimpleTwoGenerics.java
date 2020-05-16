package com.java.generics;

public class SimpleTwoGenerics {

	public static void main(String[] args)
	{
		SimpleGeneric<String,Integer> simple=new SimpleGeneric("mohan", 1234);
		simple.printType();

	}

}

class SimpleGeneric<U,V>
{
   private U objUreff;
   private V objVreff;

   public SimpleGeneric(U objUreff, V objVreff) {
	super();
	this.objUreff = objUreff;
	this.objVreff = objVreff;
}
   void printType()
   {
	   System.out.println("U type: "+objUreff.getClass().getName());
	   System.out.println("V type: " +objVreff.getClass().getName());
   }
   
}