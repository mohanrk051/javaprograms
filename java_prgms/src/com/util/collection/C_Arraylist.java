package com.util.collection;

import java.util.*;

public class C_Arraylist {

	public static void main(String[] args) 
	{
		//Collection c=new ArrayList();
		List c=new ArrayList();
		c.add("siddu");
		c.add("mohan");
		c.add("anil");
		c.add("inchara");
		c.add("bobby");
		
		System.out.println("collection c "+c);
		System.out.println(c.size());
		 
		//remove 
		
		//System.out.println(c.remove("anil"));
		System.out.println("collection c "+c);
		/*System.out.println(c.removeAll(c));
		System.out.println(c);*/
		
		//addding remaing 
		
		Collection c1=new ArrayList();
		c.add("raj");
		c.add("seeta");
		c.add("geeta");
		System.out.println(c);
		c.addAll(c1);
		System.out.println(c);
		
		// Adding an element at a particular index in an ArrayList
        c.add(3, "Elephant");
        System.out.println(c);
        c.remove(3);
        System.out.println(c);
        
        List c2=new ArrayList();
        c2.add("sri");
        c2.add("ganesh");
        c2.add("seeta");
		c2.add("geeta");
		System.out.println("c2"+c2);
		System.out.println("c"+c);
		//c.add(c2);
		/*c.removeAll(c2);
		System.out.println("after remove all ()"+c);*/
		
		/*c2.removeAll(c);
		System.out.println("after remove all ()"+c2);*/
		
		//non-matching values  removed
		c2.retainAll(c);
		System.out.println("retainAll()"+c2);
		System.out.println("c2 after retailLL "+c2);

		
	
		
		

	}

}
