
public class LinkedList
{
    public Node head;
    private Node tail;
    private int count=0;
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next=null;
        }
        public int getData()
        {
            return data;
        }
        public void setData(int data)
        {
            this.data = data;
        }
    }
    public void insert(int d)
    {
        Node node=new Node(d);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.next=node;
            tail=node;
        }
        count++;
    } 

    public void printList()
    {
        System.out.println();
        Node currentNode=head;
        while(currentNode!=null)
        {
            System.out.print("  "+currentNode.data);
            currentNode=currentNode.next;
        }
        System.out.println();
    }
    public void reset()
    {
        head=null;
        count=0;
    }
    int getCount()
    {
        return count;
    }
}