package task3;
import java.util.*;
public class SimpleProgram10 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of rows :");
		int nrows=sc.nextInt();
		
		int rowcount=1;
		
		for(int i=nrows;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<rowcount;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			rowcount++;
		}
		
	}

}
