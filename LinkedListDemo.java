import java.util.Scanner;

public class LinkedListDemo
{
    public static LinkedList list;
    public static void main(String args[])
    {
        list=new LinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of elements : ");
        int n=sc.nextInt();
        System.out.print("Enter elements :\n\t");
        for(int i=0;i<n;i++)
        {
            list.insert(sc.nextInt());
            System.out.print("\t");
        }
        list.printList();
    }
}