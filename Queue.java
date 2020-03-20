public class Queue
{
    private final int max;
    private int front=-1 , rear=-1;
    private int[] queue;
    public Queue()
	{
		this(20);
	}
	public Queue(int a)
	{
		max=a;
		queue = new int[a];
	}
    public void insert()
    {
        insert(0);
    }
    public void insert(int a)
    {
        if(front==-1)
            front=0;
        if(rear==max-1)
        {
            System.out.println("FULLQUEUE ERROR!!!");
        }
        else
        {
            queue[++rear]=a;
        }
    }
    public int delete()
    {
        if(front<0)
        {
            System.out.println("EMPTYQUEUE ERROR!!!");     
            return -576758;
        }
        if(front==rear)
        {
            int a=queue[front];
            front=rear=-1;
            return a;
        }
        return queue[front++];
    }
    public String toString()
    {
        String s="";
        for(int i=front;i<=rear&& i>-1;i++)
            s=s+"  "+queue[i];
        return s;
    }
}