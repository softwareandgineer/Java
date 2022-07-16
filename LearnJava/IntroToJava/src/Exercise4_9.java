import java.util.Scanner;

public class Exercise4_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Character");

        String a = input.nextLine();
        char ch = a.charAt(0);
        if (a.length() == 1){
            System.out.println("The character entered is " + ch);
            System.out.println("Unicode for " + ch + " is " + a.codePointAt(0));
        }
        else
            System.out.println("Invalid input");
    }
}
