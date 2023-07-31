package task4;

public class StringProgram73
{
	public static void main(String[] args)
	{
		int week=2;
		String weekstring="";
		switch(week)
		{
			case 1: weekstring="1-sunday";
			break;
			case 2: weekstring="2-monday";
			break;
			case 3: weekstring="3-tuesday";
			break;
			case 4:weekstring="4-wednesday";
			break;
			case 5:weekstring="5-thursday";
			break;
			case 6: weekstring="6-friday";
			break;
			case 7: weekstring="7-saturday";
			break;
			
			default:System.out.println("invalid week");
		}
		System.out.println( weekstring);
	}
	

}
