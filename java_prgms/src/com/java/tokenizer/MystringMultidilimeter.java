package com.java.tokenizer;

import java.util.StringTokenizer;

public class MystringMultidilimeter {

	public static void main(String[] args) 
	{
		String str= "http://10.123.43.67:80/";
		StringTokenizer st=new StringTokenizer(str,"://.");
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			
		}

	}

}
