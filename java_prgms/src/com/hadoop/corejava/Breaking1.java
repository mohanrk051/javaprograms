package com.hadoop.corejava;

import java.util.StringTokenizer;
public class Breaking1{

public static void main(String[] a){

String name="welcome to kelly technologies";

StringTokenizer str= new StringTokenizer(name," ");

while(str.hasMoreTokens()){

String token= str.nextToken();
System.out.println(token);
}

}// end of main method

}//end of class