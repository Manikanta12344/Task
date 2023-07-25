package task2;

public class PascalProgram15 
{
	int real,image;

	public PascalProgram15(int r,int i) 
	{
		this.real=r;
		this.image=i;
				
	}
	
	public void show()
	{
		System.out.println(this.real + " +i" + this.image );
	}

	
	public static PascalProgram15 add(PascalProgram15 p1,PascalProgram15 p2)
	{
		PascalProgram15 res=new PascalProgram15(0,0);
		
		res.real=p1.real + p2.real;
		
		res.image=p1.image+p2.image;
		
		return res;
	}
	
	public static void main(String[] args)
	{
		PascalProgram15 pp=new PascalProgram15(4, 5);
		PascalProgram15 pc=new PascalProgram15(10, 5);
		
		System.out.println("first complex number: ");
		pp.show();
		
		System.out.println("\nsecond complex number: ");
		pc.show();
		
		PascalProgram15 res=add(pp,pc);
		System.out.println("\naddition is:");
		res.show();
		
	}
}
