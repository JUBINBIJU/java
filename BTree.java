import java.util.Scanner;

public class BTree
{
    public Node root;
    private int count=0;
    static Scanner sc=new Scanner(System.in);
    public static class Node
    {
        int data;
        Node left,right;
        public Node(int data)
        {
            this.data = data;
            left=right=null;
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
        if(root==null)
            root=node;
        else
        {
            System.out.print("Enter parent : ");
            int p=sc.nextInt();
            Node parent=find(p,root);
            if(parent == null)
            {
                System.out.println("Parent not found!");
                return;
            }
            if(parent.left!=null && parent.right!=null)
                System.out.println("Not  a leaf node ");
            else if(parent.left==null&&parent.right==null)
            {
                System.out.print("Left child(1) or Right child(2) :");
                int x=sc.nextInt();
                if(x==1)
                    parent.left=node;
                else if(x==2)
                    parent.right=node;
                else
                    System.out.println("Invalid option!");
            }
            else if(parent.right==null)
                parent.right=node;
            else
                parent.left=node;
        }
        count++;
    }
    public void reset()
    {
        root=null;
        count=0;
    }
    int getCount()
    {
        return count;
    }
    Node find(int p,Node n)
    {
        Node h=new Node(0);
        if(n.data==p)
            return n;
        if(n.left==null&&n.right==null)
            return null;
        if(n.left!=null)
        {
            h=find(p,n.left);
        if(h!=null)
            return h;
        }
        if(n.right!=null)
            return find(p,n.right);
        return null;
    }
    void preorder()
    {
		Node s[]=new Node[count];
        Node node;
        int top=-1;
        s[++top]=root;
        while(top>=0)
        {
            node=s[top--];
            System.out.print("  "+node.data);
            if(node.right!=null)
                s[++top]=node.right;
            if(node.left!=null)
                s[++top]=node.left;
        }
        
    }
    void inorder()
    {
        Node s[]=new Node[count];
        Node node;
        int top=-1;
        s[++top]=root;
        node=root.left;
        while(top!=-1 || node!=null)
        {
            while(node!=null)
            {
                s[++top]=node;
                node=node.left;
            }
            node=s[top--];
            System.out.print("  "+node.data);
            node=node.right;
        }
    }
}