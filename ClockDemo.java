import java.util.Scanner;

class Clock{

	//variables
	
	private int seconds,minutes,hours;
	public boolean flag=true;		//variable to hold flag : flag true +ve

	//constructos

	Clock()
	{
		this(0,0,0);
	}

	Clock(int h,int m,int s)
	{
			setClock(h,m,s);
	}

	Clock(int s)
	{
		setClock(s);
	}

	//getters

	int getHours()
	{
		return hours;
	}

	int getMinutes()
	{
		return minutes;
	}

	int getSeconds()
	{
		return seconds;
	}

	//setters

	void setClock(int s)
	{
		if(s<0)
		{
			setSeconds((s%60)+60);
			s/=60;
			s-=1;
			setMinutes((s%60)+60);
			s/=60;
			s-=1;
			setHours(s%24+24);
		}
		else
		{
			setSeconds(s%60);
			s/=60;
			setMinutes(s%60);
			s/=60;
			setHours(s%24);
		}
	}

	void setClock(int h, int m, int s)
	{
		setClock(h*3600+m*60+s);
	}

	void setHours(int h)
	{
		hours=h;
	}

	void setMinutes(int m)
	{
		minutes=m;
	}

	void setSeconds(int s)
	{
		seconds=s;
	}

	//updaters

	void tick()
	{
		addClock(new Clock(0,0,1));			//ticking is basically adding 1 sec
	}

	void tickDown()
	{
		Clock c=subtractClock(new Clock(0,0,1));	//tickDown is subtracting 1 sec
		setHours(c.hours);					//need to implement a copy fuction in Clock...
		setMinutes(c.minutes);
		setSeconds(c.seconds);
	}

	//operators

	void addClock(Clock c)
	{
		seconds+=c.seconds;
		minutes+=c.minutes;
		hours+=c.hours;
		if(seconds>59)
		{
			minutes+=seconds/60;
			seconds%=60;
		}
		if(minutes>59)
		{
			hours+=minutes/60;
			minutes%=60;
		}
		if(hours>23)
		{
			hours%=24;
		}
	}

	Clock subtractClock(Clock c)
	{
		Clock c1=new Clock(hours,minutes,seconds);
		c1.seconds-=c.seconds;
		c1.minutes-=c.minutes;
		c1.hours-=c.hours;
		if(c1.seconds<0)
		{
			c1.seconds+=60;
			c1.minutes--;
		}
		if(c1.minutes<0)
		{
			c1.minutes+=60;
			c1.hours--;
		}
		if(c1.hours<0)					//hours<0 ==> time negative ==> flag=false
		{
			c1.hours+=24;
			c1.flag=false;
			return c1;
		}						//hours>=0 ==> time +ve ==> flag=true
		c1.flag=true;
		return c1;
	}

	//lessThan function for subtraction

	boolean isLessThan(Clock c)				//if second is greater then negative time is to be implemented 
	{							//based on flag situation
		if(hours>c.hours)
		{
			return true;
		}
		else if(hours==c.hours)
		{
			if(minutes>c.minutes)
			{
				return true;
			}
			else if(minutes==c.minutes)
			{
				if(seconds>=c.seconds)
				{
					return true;
				}
			}
		}
		return false;
	}

	//toString function overrider

	public String toString()
	{
		String s="(";
		if(hours<10)
		{
			s=s+"0";
		}
		s=s+hours+":";
		if(minutes<10)
		{
			s=s+"0";
		}
		s=s+minutes+":";
		if(seconds<10)
		{
			s=s+"0";
		}
		s=s+seconds+")";
		return s;
	}

}

public class ClockDemo{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter time in hours , minutes , seconds");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Clock c1=new Clock(a,b,c);
		System.out.println(" tick down ");
		System.out.println(c1);
		for(int i=0;i<10;i++)
		{
			c1.tickDown();
			System.out.println(c1);
		}
		System.out.println(" tick ");
		System.out.println("Enter time in hours , minutes , seconds");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		Clock c2=new Clock(a,b,c);
		System.out.println(c2);
		for(int i=0;i<10;i++)
		{
			c2.tick();
			System.out.println(c2);
		}
		System.out.println("tick over");
		Clock c3=new Clock();
		c3=c1.subtractClock(c2);
		System.out.println(c1 +" - "+c2 +" = "+ ((c3.flag)?(c3):(" not possible ")));
		System.out.print(c1+" + ");
		c1.addClock(c2);
		System.out.println(c2+ " = "+c1);
	}
}
