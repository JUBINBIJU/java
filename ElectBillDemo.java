
import java.util.Scanner;

class ElectBill
{
    Scanner sc=new Scanner(System.in);
    private long cno,nou;
    private String cname,cadd;
    ElectBill()
    {
        System.out.print("Enter Consumer Number : ");
        cno=sc.nextLong();
        System.out.print("Enter Consumer Name : ");
        cname=sc.nextLine();
        System.out.print("Enter Consumer Address : ");
        cadd=sc.nextLine();
        nou=0l;
    }
    ElectBill(long a,String b,String c)
    {
        cno=a;
        cname=b;
        cadd=c;
        nou=0l;
    }

    void display()
    {
        System.out.println("\n\tCONSUMER NUMBER : "+cno+"\n\tCONSUMER NAME : "+cname+"\n\tCONSUMER ADDRESS : "+cadd+"\n\tNumber of units used : "+nou);
    }

    void calculate(long m)
    {
        long u=m-nou;
        nou=m;
        float rate=(nou>300)?1.5f:(nou>200)?1.2f:(nou>100)?1.2f:0f;
        System.out.println("Amount to be paid : "+(u*rate+500));
    }
}

class ElectBillDemo
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Consumer Number : ");
        long a=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Consumer Name : ");
        String b=sc.nextLine();
        System.out.print("Enter Consumer Address : ");
        String c=sc.nextLine();
        ElectBill e=new ElectBill(a,b,c);
        e.display();
        System.out.println("Month 1");
        System.out.print("Enter meter reading : ");
        e.calculate(sc.nextLong());
        System.out.print("Enter  meter reading : ");
        System.out.println("Month 2");
        e.calculate(sc.nextLong());
        e.display();
    }
}