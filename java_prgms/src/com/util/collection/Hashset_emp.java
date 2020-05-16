package com.util.collection;

import java.util.*;


class Employe
{
	int eid;
	String ename;
	public Employe(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashcode()-employee" +super.hashCode());
		return this.eid;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid+"\t"+ename;
	}
	
	//@Override
	/*public boolean equals(Object obj) 
	{
		System.out.println("equals()-employee");
		Employe emp=(Employe)obj;
		return super.equals(emp.eid);
	}*/
}
public class Hashset_emp {

	public static void main(String[] args) 
	{
		HashSet hs1=new HashSet();
		hs1.add(new Employe(101,"siddu"));
		Employe emp2=new Employe(102,"mohan");
		hs1.add(emp2);
		hs1.add(new Employe(103,"mohan"));
		System.out.println(hs1);

	}
}