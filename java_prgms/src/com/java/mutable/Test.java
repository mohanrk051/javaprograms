package com.java.mutable;

public class Test {

	
	public static void main(String[] args) 
	{
//		Employee e1=new Employee(101,"mohan");
		//System.out.println(e1);
        Adress add=new Adress("vijaynagar");	
        Employee e2=new Employee(102,"rakesh",add);
        add.street="vijaynagar";
        System.out.println(e2);

	}

}

class Employee
{
	private int eid;
	private String ename;
	private Adress add;
	
	public Employee(int eid, String ename,Adress add) {
		this.eid = eid;
		this.ename = ename;
		this.add=add;
	}

	public int getEid() 
	{
		return eid;
	}

	public String getEname() 
	{
		return ename;
	}
	

	public Adress getAdd() {
		return add;
	}

	

	public String toString()
	{
		
		return "eid :"+eid+"\t"+"ename :"+ename+"\t"+"address :"+add;
	}
}


class Adress
{
	String street;

	public Adress(String street)
	{
		this.street = street;
	}
	 
	
}