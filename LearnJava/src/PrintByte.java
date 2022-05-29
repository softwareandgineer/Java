public class PrintByte {
    public static void main(String[] args)
    {
        byte val = 123;
        for(int mask = 128; mask > 0; mask /= 2)
        {
            if( (val & mask) != 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
        System.out.println();
    }
}
