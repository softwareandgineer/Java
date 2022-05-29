public class TestArraySum {
    public static int sum(int[] a)
    {
        int s = 0;
        for(int x: a)
        {
            s += x;
        }
        return s;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr));
    }
}
