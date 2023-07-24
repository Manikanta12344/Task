package task1;

public class SearchingAndSortingProgram14 
{
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	static void bubbleSort(int arr[])
	
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		int arr[]= {10,20,40,30};
		SearchingAndSortingProgram14 bb=new SearchingAndSortingProgram14 ();
		System.out.println("Before sorting -");
		bb.print(arr);
		
		
		bb.bubbleSort(arr);
		
		System.out.println();
		
		System.out.println("After sorting ");
		bb.print(arr);
		
		
		
		
	}

}


