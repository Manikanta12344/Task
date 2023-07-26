package task3;

public class FilesProgram4 
{
	public static void main(String[] args)
	{
		String str="manikanta";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) !=' ')
				count++;
		}
		
		System.out.println(count);
	}

}
