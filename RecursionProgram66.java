package task1;

public class RecursionProgram66
{
	void reverseString(String string)
	{
		if((string==null)||(string.length()<=1))
		System.out.println(string);
		
		else
		{
			System.out.print(string.charAt(string.length()-1));
			reverseString(string.substring(0,string.length()-1));
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		String str="hiii manikanta";
		RecursionProgram66 rp=new RecursionProgram66();
		rp.reverseString(str);
	}

}

