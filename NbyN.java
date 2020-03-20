import java.util.*;

class NbyN
{
    static Scanner sc= new Scanner (System.in);
    static Random r=new Random();
    static void printMatrix(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("\t"+r.nextInt(2));
            }
            System.out.println("\n");
        }
    }
    public static void main(String args[])
    {
        System.out.print("Enter n : ");
        printMatrix(sc.nextInt());
    }
}