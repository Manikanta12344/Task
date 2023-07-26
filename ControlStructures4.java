package task3;

public class ControlStructures4
{
	public static void main(String[] args)
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==3 && j==3)
				{
					continue;
				}
			System.out.println(i+" "+j);
			}
		}
	}

}
