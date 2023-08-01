package task5;

public class SparseMatrix2
{
	public static void main(String[] args)
	{
		int org[][]= {{1,3,4},{4,2,3},{1,6,7}};
		
		int trans[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				trans[i][j]=org[j][i];
			}
			
		}
		
		
		System.out.println("original matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(org[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("after transpose");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
