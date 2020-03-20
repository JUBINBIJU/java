import java.util.Scanner;
interface DateInt
{
    public int getYear ();
    public int getMonth ();
    public int getDay ();
    public static boolean isLeapYear( int year )
    {
        return (year%400==0 || (year %4==0 && year % 100!=0));
    }
}

class DateInt1 implements DateInt
{
    private int year=1900,month=1,day=1;
    DateInt1(int a,int b,int c)
    {
        day=a;
        month=b;
        year=c;
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

class DateIntDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date , month, year");
        DateInt1 a=new DateInt1(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(DateInt.isLeapYear(a.getYear()));
    }
}