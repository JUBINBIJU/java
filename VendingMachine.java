import java.util.*;

class VendingMachine
{
    static int []balance={20,16,12,10,4};
    static int[] coins={1,2,5,10,20};
    static Scanner sc=new Scanner(System.in);

    static boolean getCoins(int p)
    {
        int input[]=new int[p];
        int count=0,choice=-1;
        while(p>0)
        {
            System.out.println("Input money (Accepted denominations are : 1,2,5,10,20) :\n ( 0 to exit)");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:balance[0]++;
                p=p-choice;
                input[count++]=choice;
                break;
                case 2:balance[1]++;
                p=p-choice;
                input[count++]=choice;
                break;
                case 5:balance[2]++;
                p=p-choice;
                input[count++]=choice;
                break;
                case 10:balance[3]++;
                p=p-choice;
                input[count++]=choice;
                break;
                case 20:balance[4]++;
                p=p-choice;
                input[count++]=choice;
                break;  
                case 0:p=0;
                break;
                default:choice=0;
                p=0;
                System.out.println("invalid denomination");     
            }
        }
        if(choice==0)
        {
            int sum=0;
            if(count!=0)
            {
               for(int i:input)
                    sum+=i;
                eject(sum);               
            }
            return false;
        }
        if(p<0)
        {
            if(!eject(-p))
            {
                System.out.println("No change");
                int sum=0;
                for(int i:input)
                    sum+=i;
                eject(sum);
                return false;
            }
        }
        return true;
    }

    static boolean eject(int p)
    {
        String s="Ejecting coins : ";
        for(int i=4;i>=0;i--)
        {
            while(p>=coins[i]&& balance[i]>0)
            {
                s+=coins[i]+"  ";
                p-=coins[i];
                balance[i]--;
            }
        }
        if(p!=0)
            return false;
        System.out.println(s);
        return true;
    }

    public static void main(String[] args) {
        int prices[]={0,10,8,12,15};
        int choice=0;
        String[] display={"","BRU COFFEE\n \t Price = Rs.","BLACK COFFEE\n \t Price = Rs.","NESCAFE COFFEE\n \t Price = Rs.","BROOKE BOND COFFEE\n\tPrice = Rs.","Exiting..."};
        while(choice!=5)
        {
            System.out.println("\nCOFFEE VENDING MACHINE\n\tChoose your flavour\n\t\t1.Bru  (Rs.10)\n\t\t2.Black Coffee  (Rs.8)\n\t\t3.Nescafe  (Rs.12)\n\t\t4.Brooke Bond  (Rs.15)\n\t\t5.Exit");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 :
                case 2 :
                case 3 :
                case 4 :System.out.println(display[choice]+prices[choice]);
                        if(getCoins(prices[choice]))
                            System.out.println("\n Vending coffee");
                case 5 :break;
                default:System.out.println("Enter a valid choice\n\n\n\n");
            }
        }
    }
}