package com.hadoop.corejava;

public class KellyMethods{

	//define one method

	public void add(int a, int b){

	System.out.println("the sum of a and b is"+(a+b));

	}

	public int mul(int a, int b){

	int mul= a*b;
	return mul;

	}

	public static void increment(int i){

	System.out.println("the increment of i value is"+ (i++ + ++i));
	}


	public static void main(String[] a){
	//creating instance for class

	KellyMethods obj= new KellyMethods();

	//invoking instance method

	obj.add(10,20);
	System.out.println(obj.mul(30,25));

	//invoking static method using class name
	KellyMethods.increment(10);


	}// end of main method

	}//end of class





