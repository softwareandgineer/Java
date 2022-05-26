public class TestSort {
    public static void sort(int a[])
    {
        for(int i = 0; i < a.length - 1; i++)
        {
            boolean swapped = false;
            for(int j = 0; j < a.length - 1 - i; j++)
            {
                if (a[j] > a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    swapped = true;
                }
            }
            print(a);
            if(!swapped)
                break;
        }
    }
    public static void print(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String [] args)
    {
        int[] a = {4,5,6,1,3,2};
        sort(a);
        print(a);
    }
}
