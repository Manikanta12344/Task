package com.pst.Taskk;

import java.util.Collections;
import java.util.Vector;

public class ArrayProgram41
{
	public static void main(String[] args)
	{
		Vector<Integer> vec=new Vector<Integer>();
		
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(4);
		
		
		System.out.println("maximum: "+Collections.max(vec));
		
		System.out.println("minimum: "+Collections.min(vec));
	}

}
