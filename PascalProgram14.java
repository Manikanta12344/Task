package task2;
import java.util.*;
public class PascalProgram14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of arrays :");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int b[]=new int[size];
		
		int []addition=new int[size];
		int []subtraction=new int[size];
		
		System.out.print("please enter the "+size+"element of an array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.print("please enter the "+size+"element of an array");
		for(int i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
	
		for(int i=0;i<size;i++)
		{
			addition[i]=a[i]+b[i];
			
			subtraction[i]=a[i]-b[i];
			
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(addition[i]+"\t");
			System.out.println(subtraction[i]+"\t");
		}
		
	}

}

