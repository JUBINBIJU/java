import java.util.*;

public class CharBetween
{
    public static void main(String ags[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first character : ");
        char c1=sc.nextLine().charAt(0);
        System.out.println("Enter second character : ");
        char c2=sc.nextLine().charAt(0);
        int counter=0;
        while(c1<c2-1)
        {
            c1+=1;
            System.out.print(((counter==0)?"\n":" ")+c1);
            counter=(counter+1)%20;
        }
    }
}