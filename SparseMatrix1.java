package task5;

public class SparseMatrix1
{
	public static void main(String[] args)
	{
		
	int count=0;
	
	int a[][]= {
			{6,0,0},
			{0,6,0},
			{0,0,6}
	};
	
	int rows=a.length;
	int cols=a[0].length;
	
	
	int size=rows*cols;
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<cols;j++)
		{
			if(a[i][j]==0)
				count++;
		}
	}
	if(count >(size/2))
		System.out.println("sparse matrix");
	else
		System.out.println("not sparse matrix");
	
	}

}
