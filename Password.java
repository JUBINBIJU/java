import java.util.Scanner;

class Pass
{
    private String s;
    public boolean validity=false;
    Pass(String s)
    {
        this.s=s;
        validity = checkValidity(s);
    }
    public static boolean checkValidity(String s)
    {
        int digitCount=0;
        if(s.length()<10)
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                digitCount++;
            }
            else if(!(Character.isLetter(s.charAt(i))))
            {
                return false;
            }
        }
        if(digitCount<2)
        {
            return false;
        }
        return true;
    }
}

public class Password
{
    public static void main(String[] s)
    {
        String p;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Password : ");
        p=sc.nextLine();
        System.out.println((new Pass(p).validity)?("Valid Password"):("invalid !!!"));
    }
}