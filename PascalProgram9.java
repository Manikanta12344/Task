package task2;

public class PascalProgram9 
{
	public static void main(String[] args)
	{
		int number=45678;
		int reverse=0;
		int sum=0;
		while(number!=0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number/=10;	
		}
		
		int temp=reverse;
		int digit=0;
		while(temp!=0) 
		{
			digit=temp%10;
			sum=sum+digit;
			temp/=10;
		}
		
		
		System.out.println("The sum of:"+sum);
		
		
		System.out.println("The reverse of :"+reverse);
	}

}
