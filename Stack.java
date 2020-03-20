
public class Stack
{
	private final int MAX;
	private int top=-1;
	private int[] stack;
	public Stack()
	{
		this(20);
	}
	public Stack(int a)
	{
		MAX=a;
		stack = new int[a];
	}
	public void push()
	{
		push(0);
	}
	public void push(int item)
	{
		if(top<MAX-1)
		{
			stack[++top]=item;
		}
		else
		{
			so.p("STACK OVERFLOW!!!");
		}
	}
	public int pop()
	{
		if(top>=0)
		{
			return stack[top--];
		}
		else
		{
			so.p("STACK UNDERFLOW!!!");
			return -100000;
		}
	}
}

