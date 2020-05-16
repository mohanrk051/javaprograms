package com.java.enums;

 // enum Season{SUMMER,WINTER,SPRING,FALL} 

public class EnumExample1 
{   
	//enums are declared insie class
	public enum Season{SUMMER,WINTER,SPRING,FALL;}

	public static void main(String[] args)
	{
		//traversing the Enums
		for (Season s :Season.values())
		{
			System.out.println(s);
			
		}
		
		

	}

}
