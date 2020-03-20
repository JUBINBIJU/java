import java.util.Scanner;

class LoopCheck
{
    static void loopCheck(LinkedList l)
    {
        int len=0;
        LinkedList.Node a=l.head;
        LinkedList.Node arr[]=new LinkedList.Node[l.getCount()];
        for(int i=0;i<arr.length;i++)
        {
            if(contains(arr,a))
            {
                System.out.println("Loop exists!!!");
                return;
            }
            arr[len++]=a;
            a=a.next;
        }
        System.out.println("No Loop");
    }
    static boolean contains(LinkedList.Node[] arr,LinkedList.Node s)
    {
        for(LinkedList.Node i:arr)
            if(i==s)
                return true;
        return false;
    }
    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
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
        loopCheck(list);
        try
        {
            list.head.next.next.next=list.head.next;
            System.out.println("Changing list & rechecking : ");
            loopCheck(list);
        }
        catch(NullPointerException e)
        {
            System.out.println("Try bigger list");
        }
    }
}