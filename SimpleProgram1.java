package task2;
import java.util.*;
public class SimpleProgram1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principal:");
		double principal=sc.nextDouble();
		
		System.out.println("enter the rate:");
		double rate=sc.nextDouble();
		
		System.out.println("enter the time:");
		double time=sc.nextDouble();
		
		double intrest=(principal*time*rate)/100;
		
		
		System.out.println("principal:"+principal);
		System.out.println("rate"+rate);
		System.out.println("time"+time);
		
		System.out.println("intrest"+intrest);
		
		
		
		sc.close();
		
	}

}
