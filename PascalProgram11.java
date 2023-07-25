package task2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Vector;

public class PascalProgram11 
{
	public static void main(String[] args)
	{
		Vector <Integer> vec=new Vector<Integer>();
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(10);
		
		System.out.println(vec);
		
		
		LinkedHashSet<Integer> hec=new LinkedHashSet<Integer>(vec);
		vec.clear();
		
		vec.addAll(hec);
		System.out.println(hec);
	}

}
