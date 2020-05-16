package com.java.anonymousinnerclass;

class Hello
{
	void m1()
	{
		System.out.println("m1()-Hello");
	}
}
abstract class Hello1
{
	void m1()
	{
		System.out.println("m1()-hello1");
	}
}

abstract class Hello2
{
	abstract void m1();
}

interface ClickEvent
{
	void click();
}


public class Test {

	public static void main(String[] args) 
	{
		Hello h=new Hello();
		h.m1();
		
		//Hello1 h1=new Hello1();  //cant instantiate abstract class so
		//h1.m1(); soln to create anonymous class inside a hello1 object ..m1() becomes subclss of hello1 override it
        Hello1 h1=new Hello1(){};    //->anonymous inner class
      //or class hellosub extends hello1
        h1.m1();
        
        Hello2 h2=new Hello2()
        {
        	int a=10;
        	//static int b=20; cant allowed static variable
        	void m1()
        	{
        		System.out.println("m1()-anonymous inner class for hello2");
        		m3();
        	}
        	void m3()
        	{
        		System.out.println("m3()");
        	}
        };
        
        ClickEvent click=new ClickEvent()
        {
        	@Override
        	public void click() 
        	{
        		System.err.println("user clicked -show details");
        		
        	}
        };
	}

}
