import java .util.Scanner;
import java.lang.Math;

class Euclid 
{
    private static double a1,b1,c1,a2,b2,c2;
    static double Distance()
    {
        return Math.sqrt((a1-a2)*(a1-a2)+(b1-b2)*(b1-b2)+(c1-c2)*(c1-c2));
    }
    public static void main(String rgs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter coordinates of first point : ");
        a1=sc.nextDouble();
        b1=sc.nextDouble();
        c1=sc.nextDouble();
        System.out.print("Enter coordinates of first point : ");
        a2=sc.nextDouble();
        b2=sc.nextDouble();
        c2=sc.nextDouble();
        System.out.println("Euclidian distance : " + Distance());
    }
}