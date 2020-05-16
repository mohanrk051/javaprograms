package com.java.system;

public class SystemIdentityHashCode {

	public static void main(String[] args)
	{
		String a= new String();
		System.out.println(a);
		
		String b=new String();
		System.out.println(b);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

	}

}
