package com.java.system;

import java.io.*;




//The setIn() method of Java System class is used to reassign the "standard" input stream.
public class SystemSetInExample {

	public static void main(String[] args)  throws Exception
	{

		File f=new File("E:\\output.txt");
		File f1=new File("E:\\input.txt");
		System.out.println(f1.exists());
		FileInputStream fis=new FileInputStream(f1);
		System.setIn(new FileInputStream(f1));
		PrintStream i=new PrintStream(new FileOutputStream(f));
		//System.setOut(i);
		while (true) {
			int x=System.in.read();
			if(x<0)break;
			char ch=(char)x;
			System.out.print(ch);
			
		}
		
		System.out.println("Okkkkk");
		//System.out.println("ok sir");
		
		
	}

}
