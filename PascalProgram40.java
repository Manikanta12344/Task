package task1;

import java.util.regex.Pattern;

public class PascalProgram40
{
	public static void main(String[] args)
	{
		System.out.println(Pattern.matches("[sai]","s"));
		

		
		System.out.println(Pattern.matches("[789]{1}[0-9]{11}","801234567891"));
		
		
		System.out.println(Pattern.matches("[a-zA-Z]*","Aa"));
		
		
		System.out.println(Pattern.matches("[man]*","mnn"));
		
		
		System.out.println(Pattern.matches("[mani]+","mann"));
	}

}
