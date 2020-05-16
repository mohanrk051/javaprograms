package com.java.system;

import java.util.Properties;

public class SystemSetPropertiesExample {

	public static void main(String[] args) 
	{
		System.out.println(System.getProperty("os.name"));
	    Properties p=System.getProperties();
	    p.put("os.name", "LInux");
	    System.setProperties(p);
	    System.out.println(System.getProperty("os.name"));

	}

}
