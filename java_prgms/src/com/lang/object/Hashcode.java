package com.lang.object;



class Hello 
{
	
}
interface In
{
	
}
class Hai implements In
{
	
}

public class Hashcode {

	public static void main(String[] args) 
	{
		Hello h=new Hello();
		System.out.println(h.hashCode());
		
		Hai hai=new Hai();
		System.out.println(hai.hashCode());
	}
	

}

