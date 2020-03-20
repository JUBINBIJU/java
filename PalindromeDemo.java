import java.util.Scanner;

class Palindrome
{
    private String s;
    boolean palindrome;
    Palindrome()
    {
        this("");
    }
    Palindrome(String a)
    {
        s=a;
        palindrome=isPalindrome();
    }
    boolean isPalindrome()
    {
        return (s.compareToIgnoreCase(reverse())==0);
    }
    private String reverse()
    {
        String a="";
        a=a+s.charAt(s.length()-1);
        a.trim();
        for(int l=s.length()-2;l>=0;l--)
        {
            a=a+s.charAt(l);
        }
        return a;
    }
}

public class PalindromeDemo
{
    public static void main(String[] a)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String : ");
        Palindrome p=new Palindrome(sc.nextLine());
        System.out.println((p.palindrome)?("Palindrome..."):("Not Palindrome"));
    }
}