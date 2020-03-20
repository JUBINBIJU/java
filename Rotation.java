import java.util.Scanner;

class Rotation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first String : ");
        String s1=sc.nextLine();
        System.out.print("Enter second String : ");
        String s2=sc.nextLine();
        s2=s2+s2;
        if(s2.indexOf(s1)>-1)
            System.out.println("Rotations");
        else
            System.out.println("Not Rotations");            
    }
}