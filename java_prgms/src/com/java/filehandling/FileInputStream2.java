package com.java.filehandling;

import java.io.FileInputStream;

public class FileInputStream2 {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin=new FileInputStream("E:\\input1.txt");
		int i=0;
		
		while ((i=fin.read())!=-1) 
		{
			System.out.print((char)i);
		}
		fin.close();

	}

}
