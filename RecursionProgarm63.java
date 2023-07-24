package task1;

public class RecursionProgarm63 
{
	public static void main(String[] args)
	{
		int m1=356,m2=50;
		int hcf=hcf(m1,m2);
		
		System.out.println(hcf);
		
	}

	private static int hcf(int m1, int m2) 
	{
		// TODO Auto-generated method stub
		if(m2!=0)
		return hcf(m2,m1%m2);
		else
			return m1;
		
	}


}
