//Subtraction Quiz
import java.util.Scanner;
public class Listing3_3 {
    public static void main(String[] args){
        //generates two single digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        //swaps them if the first is smaller than the second so the answer will be pos
        if (number1 < number2){
            int tmp = number1;
            number1 = number2;
            number2 = tmp;
        }

        System.out.println("What is " + number1 + " minus " + number2 + " ?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (answer == number1 - number2){
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Incorrect");
            System.out.println("The answer should be " + (number1 - number2));
        }
    }
}
