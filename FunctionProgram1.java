package task3;
import java.util.*;

class Test
{
    void areacircle()
    {   
        System.out.print("enter the radius :");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float ar = (r * r) * 22 / 7;
        System.out.println("area of the circle is : "+ar+" sq units.");
    }
}

public class FunctionProgram1 
{

	public static void main(String [] args)
	{
		Test obj=new Test();
		obj.areacircle();
		
	}

}
