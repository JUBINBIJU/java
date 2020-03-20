
import java .util. Scanner;

abstract class Figure
{
    double dim1,dim2;
    abstract double area();
    Figure()
    {
        this(0,0);
    }
    Figure(double a, double b)
    {
        setData(a,b);
    }

    void setData(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
}

class Rectangle extends Figure
{
    Rectangle()
    {
        super();
    }
    Rectangle(double a, double b)
    {
        super(a,b);
    }
    double area()
    {
        return dim1*dim2;
    }
}

class Triangle extends Figure
{
    double dim3;
    Triangle()
    {
        super();
        dim3=0;
    }
    Triangle(double a,double b,double c)
    {
        super(a,b);
        dim3=c;
    }
    void setData(double a,double b,double c)
    {
        dim1=a;
        dim2=b;
        dim3=c;
    }
    double area()
    {
        double s=(dim1+dim2+dim3)/2;
        double area=s*(s-dim1)*(s-dim2)*(s-dim3);
        return Math.sqrt(area);
    }
}

class FigureDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth for reactangle : ");
        Rectangle a=new Rectangle(sc.nextDouble(),sc.nextDouble());
        System.out.println("Area of Rectangle : "+a.area());
        System.out.print("Enter sides of triangle : ");
        Triangle b=new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Area of Tringle : "+b.area());
    }
}