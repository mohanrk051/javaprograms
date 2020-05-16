package com.java.system;

import java.io.*;

//The setOut() method of Java System class is used to reassign the standard output stream. 

public class SystemSetOutExample {

	public static void main(String[] args)  throws Exception
	{

		File f=new File("E:\\output.txt");  
        System.out.println("file exist = "+f.exists());  
        FileOutputStream i=new FileOutputStream(f);  
        System.setOut(new PrintStream (i));  
        System.out.println("OK");  
	}

}
