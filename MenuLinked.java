import java . util . Scanner;

class MenuLinked
{
    public static LinkedList list;

    public static void main(String args[])
    {
        int c=0;
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.print("Choose an option : \n\t1)Create a Linked list\n\t2)Display\n\t3)Find Middle Element\n\t4)Reverse the list\n\t5)Exit\n:: ");
            c=sc.nextInt();
            try
            {
                switch(c)
                {
                    case 1:
                            LinkedListDemo.main(args);
                            list=LinkedListDemo.list;
                        break;
                    case 3:
                            System.out.println("Middle element : "+FindMiddle.findMiddle(list));
                        break;
                    case 2:
                            list.printList();
                        break;
                    case 4:
                            int counter = 0;
                            LinkedList.Node currentNode=list.head;
                            while(currentNode!=null)
                            {
                                counter++;
                                currentNode=currentNode.next;
                            }
                            Stack s=new Stack(counter);
                            currentNode=list.head;
                            while(currentNode!=null)
                            {
                                s.push(currentNode.data);
                                currentNode=currentNode.next;
                            }
                            list.reset();
                            while(counter>0)
                            {
                                list.insert(s.pop());
                                counter--;
                            }
                            list.printList();
                }
            }
            catch(Exception e)
                {
                    System.out.println("-----Create list first-----");
                }
        }while(c!=5);
    }
}