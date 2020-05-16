package com.java.filehandling;

import java.io.*;

public class BufferInputStream1 {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin=new FileInputStream("E:\\input1.txt");
		BufferedInputStream b=new BufferedInputStream(fin);   // read data of file using BufferedInputStream
		int i;
		while ((i=b.read())!=-1) 
		{
			System.out.print((char)i);
		}
		b.close();
		fin.close();

	}

}
