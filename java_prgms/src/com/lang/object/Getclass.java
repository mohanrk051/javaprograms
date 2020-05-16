package com.lang.object;

class Hello1
{
	
}
class Hai1 extends Hello1
{
	
}
public class Getclass 
{
	

	public static void main(String[] args) 
	{
		Hello1 h=new Hello1();
		Class cl1=h.getClass();
		System.out.println(cl1);
		System.out.println(cl1.getName());
		System.out.println(cl1.getSimpleName());
		System.out.println(cl1.getSuperclass());
		
        System.out.println("-----------------------");
		Hai1 hai=new Hai1();
		Class cl2=hai.getClass();
		System.out.println(cl2);
		System.out.println(cl2.getName());
		System.out.println(cl2.getSimpleName());
		System.out.println(cl2.getSuperclass());
		;

	}

}
