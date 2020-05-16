package com.java.basicprgm;

class Lab2{
	static char ch;
	public static void main(String args[]){

	System.out.println("charecter"+ch);
	System.out.println("space"+' ');
	System.out.println(ch==' ');
	System.out.println(ch==0);
	System.out.println(ch=='\u0000');

	char ch1=0;
	for(ch1=0;ch1<256;ch1++){
	int ascii=(int)ch1;
	//System.out.println(ch1+"\t"+ascii);
	//System.out.println(ascii);
	System.err.println(ch1);
	}

	}
	}


