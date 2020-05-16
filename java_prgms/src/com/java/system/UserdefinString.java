package com.java.system;

public class UserdefinString 
{

	public static void main(String[] args) 
	{
		// String str="hello world";
		String str=new String("hello world"); //errror constructor string is undefined comment below string class
		System.out.println(str);     //jvm will not take java.lang.string class implicitly
		
		Object obj=new Object();
		Object obj1=new Hello1(); //error remove /comment  object class
		Hello1 h1=new Hello1();
		System.out.println(h1.hashCode());

	}

}

/*class String
{
	
}
*/

/*class Object
{
	
}*/

class Hello1 extends java.lang.Object
{
	
}