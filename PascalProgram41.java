package task1;

import java.util.Stack;

public class PascalProgram41 
{
	public static void main(String[] args)
	{
		Stack<Integer> sc=new Stack <Integer>();
		
		boolean result=sc.empty();
		System.out.println(result);
		
		
		sc.add(78);
		sc.add(22);
		sc.add(12);
		
		System.out.println(sc);
		
		
		result=sc.empty();
		System.out.println(result);
	}

}
