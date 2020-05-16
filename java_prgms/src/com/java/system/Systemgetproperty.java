package com.java.system;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class Systemgetproperty {

	public static void main(String[] args)  throws Exception
	{
		
		FileOutputStream fos=new FileOutputStream("E:\\output.txt");
		System.setOut(new PrintStream(fos));
		System.out.println("out hello world main end");
		System.out.println("------------------");
		
	    Properties p=System.getProperties();
	    System.out.println(p.getProperty("os.name")); //property to get Operating system name  
	    System.out.println(p.getProperty("os.arch")); //property to get Operating system architecture  
	    System.out.println(p.getProperty("os.version")); //property to get Operating system version  
	    System.out.println(p.getProperty("user.name")); //property to get User's account name  
	    System.out.println(p.getProperty("user.home")); //property to get User's home directory  
	    System.out.println(p.getProperty("user.dir")); //property to get User's current working directory 
	    System.out.println(" after set properties");
	    System.out.println(p.setProperty("os.name","Linux"));
	    System.out.println(p.getProperty("os.name"));

	}

}
