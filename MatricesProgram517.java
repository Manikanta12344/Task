package task6;
import java.util.*;
public class MatricesProgram517
{
	//symmeetry of the matrix
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int matrix[][]=new int[3][3];
		
		System.out.println("enter the number of rows:");
		int row=sc.nextInt();
		
		System.out.println("enter the number of columns");
		int col=sc.nextInt();
		
		
		System.out.println("enter the elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("our matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		if(row!=col)
		{
			System.out.println("it is not a square matrix so it is not a symmetric matrix ");
		}
		else
		{
			boolean symmetric=true;
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(matrix[i][j] != matrix[j][i])
					{
						symmetric=false;
						break;
					}
				}
			}
			
			if(symmetric)
			{
				System.out.println("it is a symmetric");
			}
			else
			{
				System.out.println("not a symmetric");
			}	
		}
		sc.close();
	}

}
