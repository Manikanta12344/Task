package task3;

public class FunctionProgram3 
{
	public int CompareNum(int x,int y)
	{
		if(x>y)
			
			return x;
		
		else
			return y;
			
		
	}

	public static void main(String[] args)
	{
		FunctionProgram3 fp=new FunctionProgram3();
		int result=fp.CompareNum(5,6);
		System.out.println(result);
		
	}
}
