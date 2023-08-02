package task6;

public class RecursionProgram68
{
	//min  and max OF NUMBERS USING RECURSION
	
	static int min(int a[],int n)
	{
		if(n==1)
			return a[0];
		return Math.min(a[n-1], min(a,n-1));
		
	}
	static int max(int a[],int n)
	{
		if(n==1)
			return a[0];
		return Math.max(a[n-1], max(a,n-1));
			
	}
	
	public static void main(String []args)
	{
		int a[]= {1,2,3,4,5,6,7,8,-12,-17};
		int n=a.length;
		System.out.println("minimum:"+min(a,n));
		
		int m=a.length;
		System.out.println("maximum:"+max(a, m));
	}
}
