package com.java.system;

class Hello
{
	public static final com.java.system.Hai hai=new Hai();
	
}
class Hai
{
	void println(String str)
	{
		System.out.println(str);
	}
	void show()
	{
		System.out.println("show -Hai");
		
	}
}
public class Systemvar {

	public static void main(String[] args)
	{
		Hello.hai.println("hello world");
		Hello.hai.show();

	}

}
