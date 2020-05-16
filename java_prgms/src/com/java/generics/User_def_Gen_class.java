package com.java.generics;

public class User_def_Gen_class<T>
{
	T t;
	

	public User_def_Gen_class(T t)
	{
		super();
		this.t = t;
	}
	

	public static void main(String[] args)
	{
		User_def_Gen_class<Integer> gInt=new User_def_Gen_class(15);
		System.out.println(gInt);
		User_def_Gen_class<Float> gflt=new User_def_Gen_class(12.2);
		User_def_Gen_class<Double> gdou=new User_def_Gen_class(12.244);
		User_def_Gen_class<String> gstr=new User_def_Gen_class("welcome to generics");
		User_def_Gen_class<Number> gnum=new User_def_Gen_class(12.23232);
		

	}

}
