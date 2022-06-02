public class Queue {
    public char q[];
    private int putloc, getloc;

    public Queue(int size)
    {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch)
    {
        if(putloc == q.length)
        {
            System.out.println("q is full");
            return;
        }
        q[putloc] = ch;
        putloc++;
    }

    public char get()
    {
        if(putloc == getloc)
        {
            System.out.println("Q is empty");
            return (char)0;
        }
        char ch = q[getloc];
        getloc++;
        return ch;
    }

    public void print()
    {
        for(int i = getloc; i < putloc; i++)
        {
            System.out.print(q[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
class  QueueTest {
    public static void main(String[] args)
    {
        Queue q = new Queue(10);

        q.put('a');
        q.put('b');
        q.put('c');
        q.put('d');

        q.print();

        char c = q.get();
        c = q.get();

        q.print();

    }
}