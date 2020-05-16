package com.util.collection;

import java.util.TreeSet;

public class Comparable1 {

	public static void main(String[] args)
	{    
		 TreeSet ts=new TreeSet();
		 Employee emp=new Employee(101,"zoya");
		 ts.add(emp);
		 ts.add(new Employee(102,"raju"));
		 ts.add(new Employee(102,"raju"));
		 ts.add(new Employee(105,"sita"));
		 ts.add(new Employee(103,"siddu"));
		 System.out.println(ts);

	}

}


class Employee  implements Comparable
{
	int eid;
	String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return eid+"\t"+ename;
	}
	
	@Override
	public int compareTo(Object obj)
	{
		System.out.println("compare()-employee");
		Employee emp=(Employee)obj;
		//return this.eid-emp.eid;
		return this.ename.compareToIgnoreCase(emp.ename);
	}
}
	