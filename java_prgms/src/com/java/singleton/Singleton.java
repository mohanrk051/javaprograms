package com.java.singleton;

 class Test
 {
	private static Test t=new Test();
	private Test() 
	{
		System.out.println("private Test()");
	}


  public static Test getTest()
  {
	return t;
  }
 }
 
public class Singleton 
{
	
	public static void main(String[] args) 
	{
		Test t1=Test.getTest();
		Test t2=Test.getTest();
		Test t3=Test.getTest();
		System.out.println("t1 ref "+t1);
		System.out.println("t2 ref"+t2);
		System.out.println("t3 ref"+t3);

	}
	

}
