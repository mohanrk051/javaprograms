package com.hadoop.corejava;

public class Kelly{

	// defining variables
	int var1;
	int var2;

	//defining constructor

	/*public Kelly(){
	System.out.println("default constructor is calling");
	}*/

	//two argument constructor 

	public Kelly(int a, int b){
	var1=a;
	var2=b;
	System.out.println("the sum of var1 and var2 is"+(var1+var2));
	}

	public static void main(String[] args){

	//Kelly obj= new Kelly();//calling default constructor
	Kelly obj1= new Kelly(10,20); //calling two argument construcor

	}//end of main method

	}//end of class

