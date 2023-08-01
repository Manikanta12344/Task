package task5;

public class MatricesProgram511 
{
	public static void main(String[] args)
	{
		int a[][]= {
				{2,3,4},
				{8,6,4},
				{4,5,6}
		};
		
		int row=a.length;
		int column=a[0].length;
		
		if(row ==column)
		{
			System.out.println("upper triangle matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(i>j)
					
						System.out.print("0 ");
				
					else
					
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("lower traingle matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(j>i)
					
						System.out.print("0 ");
				
					else
					
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		else
		{
			System.out.println("not a matrix");
		}
		
	}
	

}
