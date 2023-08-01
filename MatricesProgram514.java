package task5;

public class MatricesProgram514 
{
	public static void main(String[] args)
	{
		int array[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int transpose[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j]=array[j][i];
			}
		}
		
		System.out.println("before transpose");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("after transpose");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
