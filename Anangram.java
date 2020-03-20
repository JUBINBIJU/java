import java.util.*;

public class Anangram
{
    public static boolean isAnangram(String a , String b)
    {
        if(a.length()!=b.length())
            return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first word : ");
        String a=sc.nextLine();
        System.out.print("Enter second word : ");
        String b=sc.nextLine();
        System.out.println(isAnangram(a,b)?"Anangram":"Not anangram");
    }
}