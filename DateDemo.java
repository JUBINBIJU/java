
class Date{

	private int date,month;
	/*private String[] months = { "January" , "February" , "March" , "April" , "May" , "June" , "July"  , "August" , "September" ,  "October" ,"November" ,"December"};*/
	private int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};

	Date()
	{
		this(1,1);
	}

	Date(int d, int m)
	{
		date=d;
		month=m;
	}
	/*public int daysInMonth()
	{
		for(int i=0;i<12;i++)
		{
			System.out.println(months[i]+" : "+days[i]);
		}
		return -1;
	}*/

	public int daysInMonth(int x)
	{
		return ((x>0&&x<13)?days[x-1]:-1);
	}

	public int daysInMonth()
	{
		return ((month>0&&month<13)?days[month-1]:-1);
	}

	public int getDay()
	{
		return date;
	}

	public int getMonth()
	{
		return month;
	}

	void nextDay()
	{
		date=date%days[month-1]+1;
		if(date==1)
		{
			month=month%12+1;
		}
	}

	public String toString()
	{
		String s=" ";
		if(date<10)
		{
			s+="0";
		}
		s+=date+"/";
		if(month<10)
		{
			s+="0";
		}
		s+=month;
		return s;
	}

	int absoluteDay()
	{
		int a=date;
		for(int i=0;i<month-1;i++)
		{
			a+=days[i];
		}
		return a;
	}
}

public class DateDemo{
	public static void main(String[] args)
	{
		Date jan1 = new Date(1,1);
		for(int i=0;i<367;i++)
		{
			System.out.print(jan1);
			System.out.println("    " + jan1.absoluteDay());
			jan1.nextDay();
		}
		System.out.println(jan1.daysInMonth());
		System.out.println(jan1.daysInMonth(4));
		System.out.println(jan1.getMonth());
		System.out.println(jan1.getDay());
	}
}
