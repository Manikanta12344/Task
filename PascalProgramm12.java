package task2;

public class PascalProgramm12 
{
	public static void main(String[] args)
	{
		int x=9;
		int y=12;
		int gcd=1;
		
		for(int i=1;i<=x && i<=y;i++)
		{
			if(x%i==0 && y%i==0)
				gcd=i;
		}
		
		int lcm=(x*y)/gcd;;
		
		System.out.println(lcm);
	}

}
