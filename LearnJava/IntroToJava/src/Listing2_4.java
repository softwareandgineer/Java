//Compute area with constant
import java.util.Scanner;
public class Listing2_4 {
    public static void main(String[] args) {
        final double PI = 3.14159; // declaring a final constant value

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
