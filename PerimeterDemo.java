import java .util .Scanner;

interface Perimeter
{
    double PI=3.1415926;
    double perimeter();
}

class Circle implements Perimeter
{
    double radius;
    public double perimeter()
    {
        return 2*PI*radius;
    }
    Circle()
    {
        this(0);
    }
    Circle(double d)
    {
        radius=d;
    }
}

class Rectangle implements Perimeter
{
    double length,breadth;
    Rectangle()
    {
        this(0,0);
    }
    Rectangle(double a,double b)
    {
        length=a;
        breadth=b;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}

class PerimeterDemo
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        Circle c=new Circle(sc.nextDouble());
        System.out.println("Perimeter of circle is : "+c.perimeter());
        System.out.print("Enter length and breadth of Rectangle : ");
        Rectangle r=new Rectangle(sc.nextDouble(),sc.nextDouble());
        System.out.println("Perimeter of Rectangle is : "+r.perimeter());
    }
}
