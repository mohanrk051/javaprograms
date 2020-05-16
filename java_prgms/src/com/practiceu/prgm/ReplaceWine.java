package com.practiceu.prgm;

public class ReplaceWine {

	public static void main(String[] args) 
	{
		String redwine_glass="redwine";
		String whitewine_glass="whitewine";
		String empty_glass;
		empty_glass=whitewine_glass;
		whitewine_glass=redwine_glass;
		redwine_glass=empty_glass;
		System.out.println("redwine_glass = " + redwine_glass + "  whitewine_glass = " + whitewine_glass);

	}

}
