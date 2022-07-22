//Guess number
import java.util.Scanner;
public class Listing5_3 {
    public static void main(String[]args){
        int number = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 100");

        int guess = -1; //make sure the number u set it to cannot be equal to the number so it loops
        while(guess != number){
            System.out.println("Enter your guess");
            guess = input.nextInt();

            if(guess == number)
                System.out.println("You got it right!");
            else if(guess > number)
                System.out.println("Your number is too high, try again.");
            else
                System.out.println("Your number is too low, try again.");
        }
    }
}
