//Lottery Java
import java.util.Scanner;
public class Listing3_8 {
    public static void main(String[] args){
        //generate a random lottery number
        int lottery = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery digits (1-2 digits)");
        int guess = input.nextInt();

        //get the two lottery digits
        int l1 = lottery / 10;
        int l2 = lottery % 10;

        //get the two guessed digits
        int g1 = guess / 10;
        int g2 = guess % 10;

        System.out.println("The lottery number is " + lottery);
        if(guess == lottery)
            System.out.println("You win!");
        else{
            System.out.println("You lose.");
        }
    }
}
