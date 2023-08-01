package task5;
import java.util.*;
public class MatricesProgram54 {

	public static void main(String[] args)
	{
		int array[][]=new int[5][5];
		double square=0,result=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int row=sc.nextInt();
		
		System.out.println("enter the number of columns");
		int column=sc.nextInt();
		
		System.out.println("enter the matrix ");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				array[i][j]=sc.nextInt();
				System.out.print(" ");
			}
			
		}
		
		System.out.println("following matrix :");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("the norm of the given matrix is:");
		for(int i=0;i<row;i++)
		{	
			
			for(int j=0;j<column;j++)
			{
				square=square +(array[i][j])*(array[i][j]);
			}
		}
		
		result=Math.sqrt(square);
		System.out.println(result);
	}

}
