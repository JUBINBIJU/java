
import java.util.Scanner;
import java.lang.Math;

class Coordinate
{
    static void cartesianToPolar(double x,double y)
    {
        double d=Math.sqrt(x*x+y*y);
        double a=Math.toDegrees(Math.atan(y/x));
        System.out.println("\n\tDistance from Origin = "+d+"\n\tAngle(c.c.w) = "+a);
    }
    static void polarToCartesian(double d,double a)
    {
        double x=d*Math.sin(Math.toRadians(a));
        double y=d*Math.cos(Math.toRadians(a));
        System.out.println("\n\tX = "+x+"\n\tY ="+y);
    }
}

class CoordinateDemo
{
    public static void main(String args[])
    {
        int c=4;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("\nPick an option to convert :\n\t1.Cartesian to Polar\n\t2.Polar to Cartesian\n\t3.exit\n\t\t\t: ");
            c=sc.nextInt();
            switch(c)
            {
                case 1 : System.out.print("Enter x,y : ");
                         Coordinate.cartesianToPolar(sc.nextDouble(),sc.nextDouble());
                         break;
                case 2 : System.out.print("Enter distance , angle : ");
                         Coordinate.polarToCartesian(sc.nextDouble(),sc.nextDouble());
                         break;
                case 3 : break;
                default : System.out.println("Enter a valid choice!");
            }
        }while(c!=3);
    }
}