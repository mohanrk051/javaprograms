package com.java.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Gen1_AL {

	public static void main(String[] args) 
	{
		ArrayList <String> al=new ArrayList<String>();
		/*  //without generics
		 * al.add("raju"); al.add(new Integer(2)); String name1=(String)al.get(0);  
		 * String name2=(String) al.get(0); System.out.println(name1);
		 * System.out.println(name2);
		 */
		al.add("mohan");
		//String name1=al.get(0);  //not req to typecast
	     Iterator <String> s=al.iterator();
	    while (s.hasNext()) {
			String str =  s.next();
			System.out.println(str+" --> name length is "+str.length());
			
		}
	    
	    
		

	}

}
