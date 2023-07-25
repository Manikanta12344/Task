package task2;

public class SimpeProgarm10
{
	public static void main(String[] args)
	{
		int n=5;
		int rowcount=1;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= rowcount; j++)  
            {  
                System.out.print(rowcount+" ");  
            }  
			
		
		System.out.println();
		rowcount++;
	}
}

}