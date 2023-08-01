package task5;
import java.util.*;
public class MatricesProgram56 
{
	public static void main(String[] args)
	{
		int array[][]=new int[5][5];
		int sum=0;
		int size=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		
		
		System.out.println("enter the number of column");
		int column=sc.nextInt();
		
		
		System.out.println("enter the matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("your matrix look like");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(i!=j && (i+j!=size-1))
                {
                    sum=sum+array[i][j];
                }

			}
		}
		System.out.println(sum);
		
		
	}

}
