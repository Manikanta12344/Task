package task1;

import java.util.Arrays;

public class SearchingAndSortingProgram12 
{
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40};
		int key=30;
		
		int result=Arrays.binarySearch(arr,key);
		
		if(result<0)
			
		System.out.println("not found");
		
		else
			
		System.out.println("found :"+result);	
		
	}

}
