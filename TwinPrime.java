
public class TwinPrime
{
    private static byte max = 100,start=3;
    private static boolean isPrime(byte n)
    {
        for(byte i=3;i<=Math.sqrt((int)n);i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        for(byte i=start;i<max;i+=2)
        {
            if(isPrime(i)&&isPrime((byte)(i+2)))
            {
                System.out.println("  "+i+"  "+(i+2));
            }
        }
    }
}