import java.util.Arrays;

class ArrayDemo
{
    public static void main(String []s)
    {
        Number a[][]= new Number[3][];
        a[0]=new Number[1];
        a[0][0]=32;
        a[1]=new Number[2];
        a[1][0]=500;
        a[1][1]=300;
        a[2]=new Number[2];
        a[2][0]=39.45;
        a[2][1]=600;
        for(Number[] n: a)
        {
            for(Number i : n)
            {
                System.out.print("  "+i);
            }
            System.out.println("\n  "+n.length);
        }

    }
}