import java.util.Scanner;

public class BinarySearch
{
    static void binarySearch(int arr[],int item)
    {
        int f=0,l=arr.length-1;
        int m=0;
        while(f<=l)
        {
            m=(f+l)/2;
            if(arr[m]==item)
            {
                System.out.println(" Found at "+(m+1));
                break;
            }
            else if(arr[m]>item)
                l=m-1;
            else
                f=m+1;
        }
        if(arr[m]!=item)
        {
            System.out.println("Not found");
        }
    }
    public static void main(String argd[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit : ");
        int limit=sc.nextInt();
        int arr[]=new int[limit];
        System.out.println("Enter elements : ");
        for(int i=0;i<limit;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter item : ");
        int item=sc.nextInt();
        binarySearch(arr,item);
    }
}