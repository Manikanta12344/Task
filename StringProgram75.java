package com.pst.Taskk;

public class StringProgram75
{
	public static void main(String[] args)
	{
		String str="MANAM";
		boolean bool=true;
		
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				bool=false;
				break;
			}
		}
		if(bool)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
