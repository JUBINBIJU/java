class FindMiddle extends LinkedListDemo
{
    static int findMiddle(LinkedList list)
    {
        LinkedList.Node n1=list.head,n2=n1;
        while(n2.next!=null && n2.next.next!=null)
        {
            n1=n1.next;
            n2=n2.next.next;
        }
        return n1.getData();
    }
    public static void main(String args[])
    {
        LinkedListDemo.main(args);
        list.printList();
        System.out.println("Middle element is : "+findMiddle(list));
    }
}