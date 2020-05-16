package com.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin=new FileInputStream("E:\\input1.txt");
		int i=fin.read();                                     //read only single charecter
		System.out.println(i);
		System.out.println((char)i);
		fin.close();
	}

}
