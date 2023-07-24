package task1;

public class SearchingAndSortingProgram15 
{
	
	void printarr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}
	
	void insert(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0 && temp<=arr[j])
			{
				arr[j+1]=arr[j];
				j=j-1;		
			}
			arr[j+1]=temp;		
		}
	}

	public static void main(String[] args)
	{
		int arr[]= {14,21,11,41,24};
		SearchingAndSortingProgram15 spr=new SearchingAndSortingProgram15();
		
		
		System.out.println("before sorting:");
		spr.printarr(arr);
		
		spr.insert(arr);
		
		System.out.println();
		
		
		System.out.println("after sorting :");
		spr.printarr(arr);
		

		
		
		
	}
	
	
}
