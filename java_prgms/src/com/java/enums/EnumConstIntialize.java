package com.java.enums;

public class EnumConstIntialize
{
	enum Season
	{
		WiINTER(2),SUMMER(10),SPRING(4),FALL(77);
	
	private final int v;
	
	 Season(int v)
	{
		this.v=v;
		
	}
	
	}

	public static void main(String[] args)
	{
		for (Season s :Season.values()) 
		{
			System.out.println(s + " " + s.v);
			
		}

	}

}
