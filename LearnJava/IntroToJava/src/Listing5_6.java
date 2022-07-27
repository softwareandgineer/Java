//test DoWhile
import java.util.Scanner;
public class Listing5_6 {
    public static void main(String[] args){
        int data;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter an integer value, (if 0 is entered sum stops)");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
