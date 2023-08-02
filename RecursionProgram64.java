package task6;

public class RecursionProgram64
{
	//sum of nonnegative numbers recursively
	
	static int recsum(int n)
	{
		if(n<=1)
			return n;
		return n + recsum(n-1);
	}
	public static void main(String[] args)
	{
		int n=5;
		System.out.println(recsum(n));
	}

}
