package com.java.system;

import java.util.Date;

public class SystemCurrentTimeMilli {

	public static void main(String[] args)
	{
		System.out.println("current time in miiliseconds");
		System.out.println(System.currentTimeMillis());
		
		long timeinmilli=System.currentTimeMillis();
		Date d=new Date(timeinmilli);
		System.out.println("date "+d);
	}

}
