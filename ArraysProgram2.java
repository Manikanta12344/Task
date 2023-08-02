package task6;
import java.util.*;
public class ArraysProgram2 
{
	//second largest and second smallest element
	
	public static void main(String[] args)
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter the elements");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;;
					
				}
			}
		}
		System.out.println("second largest element:"+a[n-2]);
		System.out.println("second smallest element:"+a[2]);
	}

}
