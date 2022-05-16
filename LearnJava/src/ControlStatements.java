public class ControlStatements {

    public static void testMultiplicationTable()
    {
        for(int i = 1; i  <= 9; i++)
        {
            for(int j = 1; j <= 99; j++)
            {
                if(i >= j) {
                    int result = i * j;
                    System.out.print("" + i + " * " + j + " = " + result + " ");
                }
            }
            System.out.println();
        }
    }
    public static void testDoWhile() throws java.io.IOException
    {
        char result = 'k';
        char ch;
        boolean isNewLine = false;
        do {
            if(!isNewLine)
                System.out.print("Press a key to guess");
            ch = (char)System.in.read();
            if(ch == '\n') {
                isNewLine = true;
                continue;
            }
            else
                isNewLine = false;
            if(ch == result)
            {
                System.out.print("Yes, you got it");
                break;
            }
            else
            {
                System.out.println("You got it wrong nigga");
            }
        } while(ch != 'x');
    }
    public static void testPowers()
    {
        // print powers of 2 from 0 to  9 - 0^2 1^2 ...
        for(int i = 0; i < 10; i++)
        {
            int e = i;
            int result = 1;
            while(e > 0)
            {
                result *= 2;
                e--;
            }
            System.out.println("i=" + i + ", power of 2 is " + result);
        }
    }
    public static void testWhile()
    {
        //print char from 'a' to 'z' using while
        char ch = 'a';
        while(ch <= 'z')
        {
            System.out.println(ch);
            ch++;
        }
    }

    public static void testSwitch() throws java.io.IOException
    {
        // Simplified nested if else
        while(true)
        {
            char ch = (char)System.in.read();
            switch(ch) {
                case '\n':
                    continue;
                case '1':
                    System.out.println("one");
                    break;
                case '2':
                    System.out.println("two");
                    break;
                case '3':
                    System.out.println("three");
                    break;
                case 'x':
                    return;
                default:
                    System.out.println("You have typed " + ch);
                    break;
            }
        }
    }
    public static void testFor() throws java.io.IOException
    {
        //sum 1 to 100
        int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            sum += i;
        }
        System.out.println("The sum of 1 - 100 is " + sum);
    }
    public static void testIfs() throws java.io.IOException
    {
        char ch;
        while(true)
        {
            ch = (char)System.in.read();
            if (ch == '\n')
                continue;
            if (ch == '1')
                System.out.println("one");
            else if (ch == '2')
                System.out.println("two");
            else if (ch == '3')
                System.out.println("three");
            else if(ch == 'x')
                break;
            else
                System.out.println("You have typed in " + ch);
        }
    }

    public static void main(String args[]) throws java.io.IOException
    {
        //testIfs();
        //testFor();
        //testSwitch();
        //testWhile();
        //testPowers();
        //testDoWhile();
        testMultiplicationTable();
    }
}
