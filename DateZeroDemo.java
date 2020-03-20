import java.util.Scanner;

class DateZero implements DateInt
{
    private int year=1900,month=1,day=1;
    private int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    DateZero(int a,int b,int c)
    {
        day=a;
        month=b;
        year=c;
        IllegalArgumentException x=new IllegalArgumentException();
        if(year<1582)
            throw x;
        if(month>12 || month<1)
            throw x;        
        if(day<1 || day>31)
            throw x;
        if(day>days[month-1])
            if(!(DateInt.isLeapYear(year)))
                throw x;
            else if(!(month==2&&day==29))
                throw x;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
}

class DateZeroDemo
{
    public static void main(String args[])
    {
        try
        {    
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter date , month, year");
            DateZero a=new DateZero(sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println(DateInt.isLeapYear(a.getYear()));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Illegal date");
        }
    }
}