import java.util.Scanner;

class PlayWithNumbersDecomposed
{
    static void playWithTwoNumbersDecomposed()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 integers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a + b is equal to "+(a+b)+"\na - b is equal to "+(a-b)+"\na * b is equal to "+(a*b)+"\na / b is equal to "+(a/b)+"\na % b is equal to "+(a%b));
    }
    static void playWithThreeNumbersDecomposed()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 integers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("(a - b)/c  is equal to "+(a - b)/c +"\n(a - c)/b  is equal to "+(a - c)/b +"\n(b - c)/a is equal to "+(b - c)/a+"\n(b - a)/c is equal to "+(b - a)/c+"\n(c - a)/b is equal to "+(c - a)/b+"\n(c - b)/a is equal to "+(c - b)/a);
    }
    public static void main(String args[])
    {
        playWithTwoNumbersDecomposed();
        playWithThreeNumbersDecomposed();
    }
}