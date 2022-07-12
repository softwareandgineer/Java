//Hex digit 2 decimal
import java.util.Scanner;
public class Listing4_3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit");
        String hexString = input.nextLine();

        //Check if the hex string has one character
        if (hexString.length() != 1){
            System.out.println("You must enter exactly one character");
            return;
        }

        //Display decimal value
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        }
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}

