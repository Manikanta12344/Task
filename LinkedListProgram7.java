package task6;

import java.util.ArrayList;
import java.util.List;

public class LinkedListProgram7
{
	public static void main(String[] args)
	{
		List<Integer> ls1=new ArrayList<Integer>();
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
		
		List<Integer> ls2=new ArrayList<Integer>();
		ls2.add(4);
		ls2.add(5);
		ls2.add(6);
		ls2.add(4);
		
		
		List<Integer> concat=new ArrayList<Integer>();
		concat.addAll(ls1);
		concat.addAll(ls2);
		
		System.out.println("list1:"+ls1);
		System.out.println("list2:"+ls2);
		System.out.println("after concatenation"+concat);
		

	}

}
