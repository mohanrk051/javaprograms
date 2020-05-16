package com.java.generics;

public class Generic_clas {

	public static void main(String[] args)
	{
		MyGen<Integer> my=new MyGen(12);
		System.out.println(my);

		my.add(10);
		System.out.println(my.get());

	}

}

class MyGen <T>
{
	T obj;
	public MyGen(T obj)
	{
		super();
		this.obj = obj;
	}
	
	void add(T obj)
	{
		this.obj=obj;
	}
	T get()
	{
		return obj;
	}
	
	
}