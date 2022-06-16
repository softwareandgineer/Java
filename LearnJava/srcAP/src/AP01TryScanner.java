import java.util.Scanner; //imports scanner class from java util package

public class AP01TryScanner {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //create new object in order to use scanner, it has no static function
        //System.in = user input
        double r = scanner.nextDouble();
        //nextDouble reads the next double inputted
        String s = scanner.next();
        //next reads the next string inputted
        //other includes nextInt, nextLine, nextBoolean, nextFloat, etc

        System.out.println("The double you inputted is " + r);
        System.out.println("The string you inputted is " + s);
    }
}
