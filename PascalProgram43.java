package task2;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class PascalProgram43 
{
	public static void main(String[] args)
	{
		LinkedList<String> ls=new LinkedList<String>();
		
		ls.add("mani");
		ls.add("sai");
		ls.add("sri");
		
		System.out.println("after inserting:"+ls);
		
		ls.remove("sri");
		System.out.println(ls);
		
		
		
	}
}
