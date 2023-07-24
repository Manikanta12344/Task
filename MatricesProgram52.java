package task1;

public class MatricesProgram52 
{
	public static void main(String[] args)
	{
		int a[][]= {{3,2,1},{1,2,4},{2,12,3}};
		int b[][]= {{4,5,6},{7,8,9},{2,5,6}};
		
		int c[][]= new int[3][3];;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
