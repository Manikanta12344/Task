package com.pst.Taskk;

import java.util.Vector;

public class ArrayProgram47 
{
	public static void main(String[] args)
	{
		Vector <Integer> vec=new Vector <Integer> ();
		vec.add(100);
		vec.add(300);
		vec.add(200);
		
		
		System.out.println("original:"+vec);
		
		vec.remove(2);
		
		System.out.println("after removing"+vec);
		
	}

}
