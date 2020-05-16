package com.java.basicprgm;


class Type
{
	boolean b;
	short s;
	int i;
	float f;
	double d;
	long l;
	String st;
	
	void show()
	{
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(st);
	}
	
}
public class DatTypes {

	public static void main(String[] args) 
	{

		DatTypes d=new DatTypes();
		Type t=new Type();
		t.show();
		
		
	}

}
