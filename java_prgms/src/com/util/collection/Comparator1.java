package com.util.collection;

import java.util.*;

public class Comparator1 {

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet(new StudentIdCompare());
		ts.add(new Student(101,"shivu"));
		ts.add(new Student(103,"hamsa"));
		ts.add(new Student(105,"sri"));
		ts.add(new Student(101,"mk"));
		ts.add(new Student(107,"clara"));
		
		
		  Iterator it=ts.iterator(); 
		  while (it.hasNext()) { Object object = (Object)it.next(); 
		  System.out.println(object);
		  
		  }
		 
		
		/*
		 * Iterator it=ts.descendingIterator(); while (it.hasNext()) { Object object =
		 * (Object)it.next(); System.out.println(object); }
		 */

	}

}

class Student
{
	int sid;
	String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	@Override
	public String toString() 
	{
		return sid+"\t"+sname;
	}
}

class StudentIdCompare implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) 
	{
		Student st1=(Student)obj1;
		Student st2=(Student) obj2;
		return st1.sid-st2.sid;
	}
	
}

class StudentNameCompare implements Comparator
{

	@Override
	public int compare(Object obj1, Object obj2) 
	{
		Student st1=(Student)obj1;
		Student st2=(Student) obj2;
		return st1.sname.compareTo(st2.sname);
	}
	
}