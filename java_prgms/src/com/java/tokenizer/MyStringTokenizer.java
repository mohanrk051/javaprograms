package com.java.tokenizer;

import java.util.StringTokenizer;

public class MyStringTokenizer

{
public static void main(String[] args) {

 String str="this is example, of string, tokenizer";
 StringTokenizer st=new StringTokenizer(str);
 while (st.hasMoreTokens()) 
 {
	
	 System.out.println(st.nextToken(","));
	 //System.out.println("count: "+st.countTokens());

}
}}
