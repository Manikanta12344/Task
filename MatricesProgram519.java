package task6;
import java.util.*;
public class MatricesProgram519 
{
	//inverse of the matrix
	
	public static void main(String[] args)
	{
		int array[][]=new int[2][2];
		int  temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the matrix");
		//int m=sc.nextInt();
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		float det=(array[0][0]*array[1][1])  -  (array[0][1]*array[1][0]);
		System.out.println(det);
		
		
		temp=array[0][0];
		array[0][0]=array[1][1];
		array[1][1]=temp;
		array[0][1]=array[0][1];
		array[1][0]=array[1][0];
		
		System.out.println("Inverse of the matrix is");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
