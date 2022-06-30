//Compute area with user input
import java.util.Scanner;
public class Listing2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //create scanner object
        System.out.print("Enter a number for radius: ");

        double radius = input.nextDouble(); //reads the double

        double area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + "is " + area);
    }
}
