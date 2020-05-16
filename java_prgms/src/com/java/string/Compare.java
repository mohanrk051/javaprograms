package com.java.string;



public class Compare {
	   public static void main(String args[]) {
	       String str1 = "abhi";
	       String str2 = "bharat";
	       String str3 = "abhi";

	       int var1 = str1.compareTo( str2 );                    //return -1 because s1 < s2
	       System.out.println("str1 & str2 comparison: "+var1);

	       int var2 = str1.compareTo( str3 );                    ////return 0 because s1 == s3
	       System.out.println("str1 & str3 comparison: "+var2);

	       int var3 = str2.compareTo("abhi");                      ////return 1 because s2 > s1
	       System.out.println("str2 & string argument comparison: "+var3);
	   }
	}