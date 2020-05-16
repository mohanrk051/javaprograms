package com.java.highcohesion;


class Employee11
{
	void dbConnection(){}
	void register(){}
	void editEmployee(){}
	void displayEmployee(){}

}

public class Test 
{ 
	public static void main(String[] args) 

	{
	DBConnection dbcon=new DBConnection();
	Register r=new Register();
	r.getRegisterEmp();
	ModifyEmployee m=new ModifyEmployee();
	m.editEmployee();
	}
}
	
	class DBConnection
	{
		void getDBConnection()
		{
			System.out.println("db connected");
		}
	}
	 

	class Register
	{
		void getRegisterEmp()
		{
			System.out.println("user registred");
		}
	}
	
	
	class ModifyEmployee
	{
		void editEmployee()
		{
			System.out.println("user edit");
		}
	}
	
	


