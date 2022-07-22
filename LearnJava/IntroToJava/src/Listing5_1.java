//Repeat addition quiz
import java.util.Scanner;
public class Listing5_1 {
    public static void main(String[] args){
        int n1 = (int)(Math.random() * 10);
        int n2 = (int)(Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + n1 + " + " + n2 + " ?");
        int a = input.nextInt();
        while (n1 + n2 != a) {
            System.out.print("Wrong answer. Try again. What is " + n1 + " + " + n2 + "? ");
            a = input.nextInt();
        }
        System.out.println("You got it!");
    }
}
