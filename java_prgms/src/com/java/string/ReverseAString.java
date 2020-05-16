package com.java.string;

public class ReverseAString 
{

	public static void main(String[] args) 
	{
		String name="mohan";
		int len=name.length();
		//System.out.println(len);
		String rev="";
		for (int i=len-1;i>=0;i--) 
		{
			rev=rev+name.charAt(i);
			System.out.println("for rev "+rev);
			
		}
		System.out.println(rev);

	}

}
