package task5;

public class SparseMatrix3 
{
	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int atrans[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				atrans[i][j]=a[j][i];
			}
		}
		
		int b[][]= {{2,3,4},{5,6,7},{9,8,0}};
		
		int btrans[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				btrans[i][j]=b[j][i];
			}
		}
		
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=atrans[i][j]+btrans[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
