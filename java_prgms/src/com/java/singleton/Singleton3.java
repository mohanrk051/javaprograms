package com.java.singleton;

// approach 2

class Hai
{
	private static Hai hai=null;
	private Hai()
	{
		System.out.println("private hai constructor");
		
	}
	
	public static  Hai getHai()
	{
		if (hai==null) 
		{
			hai=new Hai();
			
		}
		return hai;
		
	}
}

public class Singleton3
{
	

	public static void main(String[] args) 
	{
		Hai hai1=Hai.getHai();
		System.out.println(hai1);
		System.out.println("internally runtime called");
		
		

	}

}
