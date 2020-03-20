import java.util.Scanner;

class MarkException extends Exception
{
    public String getMessage()
    {
        return "CGPA is less than 4.5";
    }
    public String toString()
    {
        return getMessage();
    }
}

class Markdemo
{
    static boolean isEligible()
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter regno : ");
            sc.nextInt();
            System.out.print("Enter CGPA : ");
            if(sc.nextFloat()<4.5f)
                throw new MarkException();
        }
        catch(MarkException m)
        {
            System.out.println(m);
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.print(isEligible()?"Eligible \n":"");
    }
}