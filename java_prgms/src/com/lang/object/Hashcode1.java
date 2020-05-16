package com.lang.object;

class Student
{
	int id;
	String name;
	public Student(int id, String name) 
	{
		//super();
		this.id = id;
		this.name = name;
	}
	void show()
	{
		System.out.println("id="+id+"name="+name);
	}
	@Override
	public int hashCode() 
	{
		///System.out.println("hashcode overriden object class");
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"\t"+name;
	}
}
public class Hashcode1 {

	public static void main(String[] args) 
	{
		Student s=new Student(101,"mohan");
		Student s1=new Student(102,"inch");
		Student s2=new Student(101,"mohan");
		System.out.println(s);
		/*System.out.println(s1);
		System.out.println(s2);*/
		String str=new String("sachin");
		System.out.println("mk");

	}

}
