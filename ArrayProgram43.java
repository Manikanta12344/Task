package com.pst.Taskk;

import java.util.LinkedHashSet;
import java.util.Vector;

public class ArrayProgram43
{
	public static void main(String[] args)
	{
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(9);
		vec.add(9);
		vec.add(8);
		vec.add(5);
		vec.add(1);
		vec.add(5);
		
		
	

		System.out.println(vec);	
		
		LinkedHashSet<Integer> hash=new LinkedHashSet<Integer>(vec);
		
		vec.clear();
		
		vec.addAll(hash);
		
		System.out.println(vec);
				
	}

}

