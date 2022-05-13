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

    public static void testBoolean()
    {
        boolean a;

        a = 100 > 10;

        if(a)
            System.out.println("100 is greater than 10");
        else
            System.out.println("This will never happen");

        boolean b1, b2;

        b1 = true;
        b2 = false;
        boolean b = b1 && (!b2);
        System.out.println(b);

    }

    public static void testFloat()
    {
        float x = 3.0f;
        float y = 4.0f;

        float z = x * y;
        System.out.println(z);
    }

    public static void testLiterals()
    {
        // Literals are the kinds of data found within a type
        // E.g. The literals of a boolean are, "True", and "False"

        boolean b1 = true;
        boolean b2 = false;

        // E.g. Literals of an int are decimal, hexadecimal, octal, and binary.

        int i = 100; // decimal
        int j = 0xFF; // hexadecimal - starting with 0x, followed by: 0-9, A-F
        int k = 011; // octal - starting with 0, followed by: 0-7
        int l = 0b11111111; // binary - starting with 0b, followed by 0-1

        // Character literals

        char a = 'A'; // single quote
        char b = '\t'; // tab

        // Other examples - '\r' = return - '\n' = new line - \\ = slash

        // String literals
        String str = "abc"; // Strings require double quotes

        // Float literals
        float f = 1.0f; // float literals require an f after the number

        //double literals
        double d = 3.14;
        double dl = 3.4e100; // scientific notation

    }

    public static void testOperators()
    {
        // + - * / %
        int x = 3 + 4;
        int y = 4 * 5;
        int z = 1 / 2;
        int w = 15 % 2;

        // ++ --
        int n = 0;
        n++; // Basically n += 1
        n--; // Basically n -= 1

    }

    public static void testRelationalOperators()
    {
        boolean b;
        int x = 1;
        int y = 2;
        int z = 3;
        b = (x > 1); // >, >=, ==, <, <=, !=

        b = (y != z);

    }

    public static void testLogicalOperators()
    {
        // & = and
        // | = or
        // ^ = xor - e.g. a ^ b: a or b is true but not both
        // ! = not
        // %% = short-circuit AND - (false && b) - b is not evaluated, return false, (if a value is already determined,
        // it ignores all other information)
        // || = short-circuit OR - (true || b) - return true, (same explanation as %%)

        boolean b = false;
        boolean c = 100 > 10;

        boolean result = b && c; // they already see b as false, so they don't evaluate boolean c
    }

    public static void testAssignment()
    {
        int x = 0;

        x += 4; // +=, -=, *=, /=, %=

        //conversion
        float f = 900.0f;
        int l = (int)f;

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
        testBoolean();
        testFloat();
    }
}
