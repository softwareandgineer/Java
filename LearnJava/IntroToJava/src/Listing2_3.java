//Computing the Average
import java.util.Scanner;
public class Listing2_3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");

        double number1 = input.nextDouble(); //reads all three doubles
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
