package task1;

public class SearchingAndSortingProgram11 
{
	static int linearSearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args)
	{
		int a1[]= {10,20,30,40};
		int key=30;
		
		
		System.out.println(linearSearch(a1,key));
		
	}

}
