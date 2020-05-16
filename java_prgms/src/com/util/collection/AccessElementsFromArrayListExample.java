package com.util.collection;

import java.util.ArrayList;

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList topCompanies=new ArrayList();
		System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
		topCompanies.add("APPLE");
		topCompanies.add("GOOGLE");
		System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
		topCompanies.add("Facebook");
		System.out.println(topCompanies);
		

	}

}
