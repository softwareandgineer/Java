//Sentinel values
import java.util.Scanner;
public class Listing5_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, when 0 is entered, the input will stop");
        int data = input.nextInt();

        int sum = 0;
        while(data != 0){
            sum += data;
            System.out.print("Enter an integer, when 0 is entered, the input will stop:");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
