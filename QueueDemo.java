public class QueueDemo
{
    public static void main(String[] a)
    {
        Queue q=new Queue(3);
        q.delete();
        System.out.println(q);
        q.insert(4);
        System.out.println(q);
        q.delete();
        System.out.println(q);
        q.insert(3);
        System.out.println(q);
        q.insert(2);
        System.out.println(q);
        q.insert(1);
        System.out.println(q);
        q.delete();
        System.out.println(q);
        q.delete();
        System.out.println(q);
        q.delete();
        System.out.println(q);
        q.delete();
        System.out.println(q);
    }
}