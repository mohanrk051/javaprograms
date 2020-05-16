package com.java.string;

public class Immutable
{
	public static void main(String[] args) 
	{
		MyString m=new MyString("mohan1");
		System.out.println(m);
		
	}
	
}
 final class MyString
{
   final String str;
 
 MyString(String s)
 {
  this.str = s;
 }
 public String get()
 {
  return str;
 }
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return str;
}

/*public String toString() {
	// TODO Auto-generated method stub
	return str;
}*/
}
