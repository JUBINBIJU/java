import java.util.*;

class Permutation
{
    static String arr[];
    static int l=0;
    void permutate(String str)
    {
        arr=new String[pcount(str)];
        System.out.println("No.of permutations : "+arr.length);
        permutation(str,0,str.length());
    }
    int pcount(String str)
    {
        int r=factorial(str.length());
        str=str.toLowerCase();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        char x='\0';
        int count=1;
        for(char i:ch)
        {
            if(i==x)
            {
                count++;
            }
            else
            {
                r/=factorial(count);
                count=1;
                x=i;
            }
        }
        r/=factorial(count);
        return r;
    }
    boolean contains(String[] arr,String s)
    {
        try
        {
            for(String i:arr)
            if(i.equalsIgnoreCase(s))
                return true;
        }
        catch(NullPointerException E)
        {

        }
        return false;
    }
    int factorial(int n)
    {
        if(n<2)
            return 1;
        return n*factorial(n-1);
    }
    void permutation(String s,int start,int end)
    {
        if(start==end)
        {
            if(!(contains(arr,s)))
                arr[l++]=s;
        }
        else
        {
            for(int i=start;i<end;i++)
            {
                if(i!=start)
                    permutation(swap(s,start,i),start+1,end);
                else
                    permutation(s,start+1,end);
            }
        }
    }
    String swap(String a ,int b,int c)
    {
        if(c==a.length()-1)
            return a.substring(0,b)+a.charAt(c)+a.substring(b+1,c)+a.charAt(b);
        return a.substring(0,b)+a.charAt(c)+a.substring(b+1,c)+a.charAt(b)+a.substring(c+1,a.length());
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word : ");
        Permutation p=new Permutation();
        p.permutate(sc.nextLine());
        System.out.println("Permutations are :");
        for(String i:arr)
        {
            System.out.println(i);
        }
    }
}