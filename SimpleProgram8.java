package task3;
import java.util.*;
public class SimpleProgram8
{
	 public static void main(String args[])
	    {
		
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter a base value :");
	        long x=sc.nextLong();
	        
	        System.out.println("Enter a power value :");
	        long y=sc.nextLong();
	        
	        long z=x;
	        
	        for(int i=1;i<y;i++)
	        {
	        	z=z * x;
	        	
	        }
	        System.out.println(z);
	        	
	    }
}