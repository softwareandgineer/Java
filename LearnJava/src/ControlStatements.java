public class ControlStatements {

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
        testIfs();
        testFor();
        testSwitch();
    }
}
