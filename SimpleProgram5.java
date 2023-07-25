package task2;

public class SimpleProgram5
{
	public static void main(String[] args)
	{
		int sum=0;
		int n=454;
		
		
		int temp=n;
		
		
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n/=10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("pallindrome");
			
		}
		else
			System.out.println("not a pallindrome");
	}

}
