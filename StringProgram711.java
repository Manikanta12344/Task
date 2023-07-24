package com.pst.Taskk;

import java.util.Arrays;

public class StringProgram711
{
	public static void main(String [] args)
	{
		String[] names= {"mani","sai","sri","basha","nandu","yash"};
		
		System.out.println("before sorting "+Arrays.toString(names));
		
		
		Arrays.sort(names);
		
		System.out.println("after sorting "+Arrays.toString(names));
	}

}
