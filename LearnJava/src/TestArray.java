public class TestArray {

    public static int findMax(int[] array)
    {
        int max = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
    public static void main(String[] args)
    {
        int a[] = new int[10];

        for(int i = 0; i < 10; i++){
            a[i] = i * 100;
    }

        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

        int b[] = {33, 4, 55, 54, 345, 3245, -23};
        int max = findMax(b);

        System.out.println("b has max value " + max);
    }
}
