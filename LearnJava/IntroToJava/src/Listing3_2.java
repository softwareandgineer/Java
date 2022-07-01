//Simple If Demo
import java.util.Scanner;
public class Listing3_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int");
        int n = input.nextInt();

        if (n % 5 == 0)
            System.out.println("Divisible by 5");

        if (n % 2 == 0)
            System.out.println("Number is even");
    }
}
