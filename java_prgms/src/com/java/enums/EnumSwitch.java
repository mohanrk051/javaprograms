package com.java.enums;

enum Day{monday,tuesday,wednesday,thursday,friday, saturday,sunday}

public class EnumSwitch
{
	public static void main(String[] args) 
	{
		Day day=Day.sunday;
		switch(day)
		{
		case sunday:
			System.out.println("Sunday");
			break;
			
		case monday:
			System.out.println("monday");
			break;

		default:
			System.out.println("other day");
			break;
		}
		
	}

}
