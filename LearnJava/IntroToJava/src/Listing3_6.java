//Testing Boolean Operators
import java.util.Scanner;
public class Listing3_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();

        if (n % 2 == 0 && n % 3 == 0)
            System.out.println("Your number is divisible by 2 and 3");
        if (n % 2 == 0 || n % 3 == 0)
            System.out.println("Your number is divisible by 2 or 3");
        if (n % 2 == 0 ^ n % 3 == 0)
            System.out.println("Your number is divisible by 2 or 3 but not both");
    }
}
