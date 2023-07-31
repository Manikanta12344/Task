package task4;

public class StringProgram74
{
	public static void main(String[] args)
	{
		int Vcount=0;
		int Ccount=0;
		int Wcount=0;
		
		String str="Hi  Manikanta";
		str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				Vcount++;
			}
			
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				Ccount++;
				
			}
			
			else if(str.charAt(i)==' ')
			{
				Wcount++;
			}
				
		}
		
		System.out.println(Vcount);
		System.out.println(Ccount);
		System.out.println(Wcount);
	}

}
