package task2;
import java.util.*;
public class PascalProgram7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the m value :");
		double a=sc.nextDouble();
		
		System.out.println("enter the n value :");
		double b=sc.nextDouble();
		
		System.out.println("enter the o value :");
		double c=sc.nextDouble();
		
		double d=b*b-4.0 * a * c;
		
		if(d>0.0)
		{
			double r1=(-b + Math.pow(d,0.5));
			double r2=(-b - Math.pow(d,0.5));
			
			System.out.println("The roots are "+r1+"and"+r2);
		}
		
		else if(d==0.0)
		{
			double r1=-b/(2.0*a);
			System.out.println("The root is :"+r1);
			
		}
		
		else
		{
			System.out.println("roots are not real");
		}
		
		
	}

}
