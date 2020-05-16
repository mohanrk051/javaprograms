package java.util.customarraylist;

class ArrayList{
	private Object elements[];
	private int capacity;
	private int size;
	public ArrayList() 
	{
		capacity=10;
		elements=new Object[capacity]; //initializing the eelements with array
	}
	
	public void add(Object obj)   //called add() object wiil be initialized
	{
		if (capacity==size)
		{
		   alterCapacity();
			
		} else {
			elements[size++]=obj;

		}
	}
	
	  void alterCapacity()  //enhance the capacity
	{
		
	}
	
	public int  size()    //size of an array
	{
		return size;
	}
	
	public Object get(int i)        //element of an specified index
	{
		if (i<0 || i>=size)
		{
			throw new IndexOutOfBoundsException("index should be in between o "+(size-1));
			
		}
		return elements[i];
	}
	
	public String toString()  //inorder to display an arraylist
	{
		StringBuffer sb=new StringBuffer("[");
		for (int i = 0; i < size; i++) 
		{
			sb.append(elements+",");
		}
		String s1=sb.substring(0,sb.length()-1)+"]";
		return s1;
	}
	
	
}
public class Manager
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("mohan");
		System.out.println(al);
		
	}
}

