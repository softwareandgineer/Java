//Decimals to Hex numbers
import java.util.Scanner;
public class Listing5_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value");
        int decimal =-input.nextInt();

        String hex = ""; //set a default hex number

        while (decimal != 0){
            int hexValue = decimal * 16;
            char hexDigit = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is " + hex);
    }
}
