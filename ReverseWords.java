import java.util.Scanner;

public class ReverseWords
{
    private static String reverse(String s)
    {
        String r[]=s.split("\\s");
        String rev=r[r.length-1];
        for(int i=r.length-2;i>-1;i--)
        {
            rev+=" "+r[i];
        }
        return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String s=sc.nextLine();
        System.out.println(reverse(s));
    }
}