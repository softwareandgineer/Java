public class ShiftDemo {
    public static void main(String[] args)
    {
        System.out.println("Left Shift for 1");
        int n = 1;
        for(int i =0; i < 32; i++)
        {
            n <<= 1;
            System.out.println(n);
        }

        System.out.println("Right Shift for -1024");
        n = -1024;
        for(int i = 0; i < 32; i++)
        {
            n >>= 1;
            System.out.println(n);
        }

        System.out.println("Unsigned Right Shift for -1024");
        n = -1024;
        for(int i = 0; i < 32; i++)
        {
            n >>>= 1;
            System.out.println(n);
        }

        int m = n > 0 ? 1 : 0;
        //? means if it is greater than 1, yes? then 1, no? then 0
    }
}
