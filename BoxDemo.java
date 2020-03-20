//Write a program in Java to create a class 'Box' which contains three data members for holding width, height and length of box and two methods
//'area' and 'volume' to calculate and return the area and volume of box.
// Create another class named 'BoxDemo' which uses Box class.

import java.util.Scanner;

class Box
{
    private int length,width,height;
    Box()
    {
        this(0,0,0);
    }
    Box(int a,int b,int c)
    {
        setData(a,b,c);
    }
    void setData(int a,int b, int c)
    {
        length=a;
        width=b;
        height=c;
    }
    void reset()
    {
        setData(0,0,0);
    }

    int area()
    {
        return 2*(length*width+length*height+width*height);
    }
    int volume()
    {
        return length*width*height;
    }
    void getData()
    {
        System.out.println("Area : "+area()+"\tVolume : "+volume());
    }
}

class BoxDemo
{
    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length, breadth, height : ");
        Box b= new Box(sc.nextInt(),sc.nextInt(),sc.nextInt());
        b.getData();
    }
}