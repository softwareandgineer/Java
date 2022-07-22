//Guess number one time
import java.util.Scanner;
public class Listing5_2 {
    public static void main(String[] args){
        int n = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 100:");
        int guess = input.nextInt();

        if(guess == n)
            System.out.println("yes you guessed right");
        else if(guess > n)
            System.out.println("your number is too large");
        else
            System.out.println("your number is too low");
    }
}
