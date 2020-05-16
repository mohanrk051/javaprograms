package com.util.collection;

import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) 
	{
		TreeSet set=new TreeSet();  //its prefer which first type object  that  element considered first
		set.add(true);   //  java.lang.Boolean cannot be cast to java.lang.String
		set.add("mohan");
		set.add("zoya");
		set.add("anil");
		set.add("kavya");
		//set.add(true);  //class cast exception string cant to cast boolean
		//set.add(11); //cannot be cast to java.lang.Integer
		System.out.println(set);
	}
}
