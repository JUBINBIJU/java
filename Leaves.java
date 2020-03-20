import java.util.Scanner;

class Leaves
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        BTree b=new BTree();
        System.out.print("How many items : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter data : ");
            b.insert(sc.nextInt());
        }
        System.out.print("leaf nodes are : ");
        printLeaves(b.root);
        System.out.println();
    }
    public static void printLeaves(BTree.Node n)
    {
        if(n.left==null&&n.right==null)
        {
            System.out.print("  "+n.data);
            return;
        }
        if(n.left!=null)
            printLeaves(n.left);
        if(n.right!=null)
            printLeaves(n.right);
    }
}