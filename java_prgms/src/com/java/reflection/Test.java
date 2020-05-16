package com.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws Exception 
	{
		//int arr[]= {11,22,33};
		 Class c1=Class.forName("com.java.reflection.Hello");
		// System.out.println(c1);
		// System.out.println(c1.getName());
		// System.out.println(c1.isAnnotation());  //false
         Class c2=Hello.class;
         //System.out.println(c2);
         
         Constructor[] c=c1.getConstructors();
         System.out.println("constructors "+Arrays.toString(c));
		/*
		 * for (int i = 0; i < c.length; i++) { System.out.println(c[i]); }
		 */
     	
     	Method[] m=c1.getDeclaredMethods();
    	for (int i = 0; i < m.length; i++) {
    		System.out.println(m[i].getParameters());
    	}
    	
    	Field[] f=c1.getDeclaredFields();
    	for (int i = 0; i < f.length; i++) {
    	System.out.println(f[i].getName());	
    	}
     		
    	Field f1 = c1.getDeclaredField("name");
    	f1.setAccessible(true);
    	System.out.println(f1.get(new Hello()));
    	
    	//acess the package
		
		  Class myClass = Class.forName("java.lang.String"); 
		  Package p = myClass.getPackage();
		  System.out.println(p);
		 
    	
    	Class myClassp1 = Class.forName("com.java.reflection.Hello");
    	Package pa = myClassp1.getPackage();
    	System.out.println(pa);
    	
    	//acess the interface
		/*
		 * Class i1 = Class.forName("com.java.reflection"); Class[] p2 =
		 * i1.getInterfaces(); System.out.println(p2);
		 */
    	
    	//Class modifiers can be accessed calling the method getModifiers() on the class object.
    	Class mod = Class.forName("com.java.reflection.Hello");
    	int modifier = mod.getModifiers();
    	System.out.println(modifier);
    	Method[] m1=mod.getMethods();
    	System.out.println(m1);
		/*
		 * Class supercl = Class.forName("java.lang.String"); Package p4 =
		 * supercl.getSuperclass();
		 */
	}

}

interface M1
{
	void m1();
}

class A implements M1
{
	public void m1()
	{
		System.out.println("m1()");
	}
}
class Hello
{
	int id;
	private String name="mohan";
	int age;

	public Hello(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	Hello()
	{
		
	}

	public Hello(int id) {
		super();
		this.id = id;
	}

	public Hello(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
 public	void add() {
		String name="mohan";
		int a=10;
		int b=20;
		int sum=a+b; 
		System.out.println(sum);
	}
}
	
	
	
	
		
