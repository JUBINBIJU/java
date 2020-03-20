import java.util.Scanner;

class Vowel
{
    static int vowelCount(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':   c++;
            }
        }
        return c;
    }
    static int vowelCount()
    {
        return 0;
    }
}

public class VowelDemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Vowel.vowelCount(s));
    }
}