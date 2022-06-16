package BookPack;

public class SeriesDemo {
    public static void main(String[] args)
    {
        ByTwos s = new ByTwos();
        s.reset();
        for(int i = 0; i < 10; i++)
        {
            int val = s.getNext();
            System.out.println(val);
        }
    }
}
