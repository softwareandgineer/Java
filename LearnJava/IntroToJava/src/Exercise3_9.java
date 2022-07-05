import java.util.Scanner;
public class Exercise3_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of the ISBN");
        int ISBN9 = input.nextInt();
        int d9 = ISBN9 % 10;
        int d8 = (ISBN9/10) % 10;
        int d7 = (ISBN9/100) % 10;
        int d6 = (ISBN9/1000) % 10;
        int d5 = (ISBN9/10000) % 10;
        int d4 = (ISBN9/100000) % 10;
        int d3 = (ISBN9/1000000) % 10;
        int d2 = (ISBN9/10000000) % 10;
        int d1 = (ISBN9/100000000) % 10;

        int dt = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if(dt == 10)
            System.out.println("The ISBN-10 number is " + ISBN9 + "X");
        else{
            System.out.println("The ISBN-10 number is " + ISBN9 + dt);
        }
    }
}
