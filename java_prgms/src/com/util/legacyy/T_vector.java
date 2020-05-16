package com.util.legacyy;

import java.util.*;

public class T_vector {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		System.out.println(v);
		System.out.println(v.size());
		v.add(101);
		v.add("mohan");
		v.add(true);
		v.add(11.233);
		v.add('A');
		System.out.println(v);
		System.out.println(v.size());
		System.out.println("for each loop");
		for (Object obj : v)
		{
			System.out.println(obj);
			
		}
		
		System.out.println("using enumeration");
	    Enumeration enm=v.elements();
	    System.out.println(enm);
	    while (enm.hasMoreElements()) 
	    {
			Object obj = (Object) enm.nextElement();
			System.out.println(obj);
		}
	    
	    System.out.println(" one again Enumeration----------");
	    Enumeration enm1=v.elements();
	    while (enm1.hasMoreElements()) 
	    {
			Object object = (Object) enm1.nextElement();
			System.out.println(object);
			
		}
	    
	    System.out.println("-------------------------------------------------------");
	    System.out.println("properties begins now");
	    Properties p=new Properties();
	    p.put("101", "raj");
	    p.put("102", "mohan");
	    p.put("102", "mohan");
	    p.put("103", "rajesh");
	    p.put("103", "rajesh");
	    p.put("104", "mithun");
	    System.out.println(p);
	    //System.out.println(p.propertyNames().toString());
	    Enumeration e=p.propertyNames();
	    while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(" prperties key values " +key);
		        String val=(String)p.get(key);
		        System.out.println(key +"\t" + val);
			
		}
	    
	    
	    


	}

}
