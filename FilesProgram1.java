package task3;

public class FilesProgram1
{
	public static void main(String[] args)
	{
		String st=new String("hello java any update");
		char []ch=new char[10];
		try
		{
			st.getChars(6, 10, ch, 0);
			System.out.println(ch);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
