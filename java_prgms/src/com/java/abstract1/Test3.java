package com.java.abstract1;

 abstract class Person
{
	void sleeping()
	{
		System.out.println("happy sleeping");
	}
	 abstract void jobStatus();
	// abstract void details();
}
 abstract class Student extends Person
 {
	
	 void details()
	 {
		 System.out.println("student of sjt");
	 }
 }

 class CurrentStudent extends Student
 {
	 void jobStatus()
	 {
		 System.out.println("still preparing");
		 
	 }
	 
 }
 
 class OldStudent extends Student
 {
	 void jobStatus()
	 {
		 System.out.println("got job");
		 
	 }
	 
 }
 public class Test3 {

	public static void main(String[] args) 
	{
		Person p=new CurrentStudent();
		p.sleeping();
		//p.details();
		Person p1=new OldStudent();
		//p1.details();
		/*Person p2=new Student();
		p2.details();*/

		
	}

}
