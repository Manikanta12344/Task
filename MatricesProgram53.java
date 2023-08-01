package task5;
import java.util.*;
public class MatricesProgram53
{
	public static void main(String[] args)
	{
		int array[][]=new int[5][5];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		
		System.out.println("enter the number of columns");
		int column=sc.nextInt();
		
		
		System.out.println("enter our matrix ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=sc.nextInt();
				System.out.print(" ");
						
			}
		}
		
		System.out.println("enter your matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("enter the trace of the matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i==j)
				{
					sum=sum+array[i][j];
				}
			}
		}
		System.out.println(sum);
		
		
	}

}
