import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String A[])
    {
        Scanner sc=new Scanner(System.in);
        Palindrome p=new Palindrome(new String()+sc.nextInt());
        System.out.println((p.palindrome)?("Palindrome..."):("Not Palindrome"));
    }
}