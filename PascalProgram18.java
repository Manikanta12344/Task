package task2;
import java.util.*;
public class PascalProgram18
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		
		System.out.println("after reversing a string");
		for(int i=s.length();i>0;i--)
		{
			System.out.print(s.charAt(i-1));
		}
		
		
	}
}
