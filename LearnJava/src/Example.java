public class Example {
    public static double galToLit(double gal)
    {
        return gal * 3.7854;
    }

    public static void printEvenNUm(int range)
    {
        for(int i = 0; i <= range; i++)
        {
            if(i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void testIntegers()
    {
        // 1 byte = 8 bits
        // byte (8 bits) -- 1 byte
        // short (16 bits) -- 2 bytes
        // int (32 bits) -- 4 bytes
        // long (64 bits) -- 8 bytes

        long l = 50000;

        long cube = l * l * l;
        System.out.println("Cube of " + l + " is: " + cube);

    }

    public static void testDouble()
    {
        double a = 3.0;
        double b = 4.0;
        double c = Math.sqrt(a * a + b * b);
        System.out.print(c);
    }

    public static void main(String[] args) {
        //System.out.println("Hello Java!");

        int var1;
        int var2;

        double x;
        x = 10.0;

        var1 = 1000;
        var2 = var1 + 1;

        x = x * x;

        double gal = 200.0;
        double lit = galToLit(gal);

        System.out.println(var2);
        System.out.println(x);
        System.out.println(lit);

        printEvenNUm(100);
        testIntegers();
        testDouble();
    }
}
