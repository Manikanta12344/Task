package task4;

class Intobj
{
	public int value;
}

public class PointersProgram2
{
	public static void main(String[] args)
	{
		Intobj a;
		Intobj b;
		a =new Intobj();
		
		b=new Intobj();
		
		a.value=42;
		
		b.value=21;
		
		b=a;
		
		b.value=21;
		
		System.out.println(a);
		
	}

}

