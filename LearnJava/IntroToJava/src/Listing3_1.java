//Addition Quiz
import java.util.Scanner;
public class Listing3_1 {
    public static void main(String[] args){
        //generates two random number through manipulating the current time in milliseconds
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " plus " + number2 + " ?");
        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

    }
}
