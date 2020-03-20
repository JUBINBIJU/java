import java.util.Scanner;

class Preorder
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
        System.out.println("Preorder Traversal : ");
        b.preorder();
    }
}