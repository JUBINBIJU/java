import java.util.Scanner;

class Word
{
    public static int wordCount(String s)
    {
        int c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            switch(s.charAt(i))
            {
                case ' ':
                case '-':
                case '+':
                case ':':
                case '.':
                case ';':   c++;
                            i++;
                            break;
            }
        }
        return c+1;
    }
}

public class WordDemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(Word.wordCount(s));
    }
}