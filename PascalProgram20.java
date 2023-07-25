package task2;

import java.util.Arrays;

public class PascalProgram20
{
	public static void main(String[] args)
	{
		int arr[]={5,3,2,1};
		System.out.println(Arrays.toString(arr));
		int max_val=arr[0];
		int min_val=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max_val)
				max_val=arr[i];
			
			else if(arr[i]<min_val)
				min_val=arr[i];		
				
		}
		
		System.out.println((max_val-min_val));
		
		
	}

}