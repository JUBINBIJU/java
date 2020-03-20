import java.util.Scanner;

public class NonRepeated
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0;
        char ch='\0';
        System.out.println("Enter string : ");
        String s=sc.nextLine();
        for(;i<s.length()-1;i++)
        {
            if(s.indexOf(s.charAt(i),i+1)<0 && s.indexOf(s.charAt(i))==i)
            {
                ch=s.charAt(i);
                break;
            }
        }
        if(ch=='\0')
        {
            if(s.indexOf(s.charAt(i))==i)
                ch=s.charAt(i);
            else
            {   System.out.println("  No non-repeated characters");
                return;
            }
        }
        System.out.println("First non-repeated character is : "+ch);
    }
}