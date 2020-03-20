import java.util.Scanner;

class RemoveSpaces
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            r+=s.charAt(i);
        }
        System.out.println(r);
    }
}