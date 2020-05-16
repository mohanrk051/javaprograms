package com.hadoop.corejava;

public class Breaking{

	public static void main(String[] a){

	String name="welcome to kelly technologies";

	String token[]=name.split("\\s");

	for(String temp:token){

	System.out.println(temp);
	}

	}// end of main method

	}//end of class