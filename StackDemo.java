class Stack
{
	private int MAX,top=-1;
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
	public void print(String s)
	{
		System.out.println(s);
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
			System.out.println("STACK OVERFLOW!!!");
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
			System.out.println("STACK UNDERFLOW!!!");
			return -100000;
		}
	}
}

public class StackDemo
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push(5);
		s.push(8);
		System.out.println(s.pop());
		s.push(4);
		System.out.println(s.pop()+s.pop());
		System.out.println(s.pop());
	}
}
