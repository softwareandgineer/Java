import java.util.Scanner;
public class Exercise3_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x and y coords");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x == 1)
            System.out.println("You are inside");
        if (x == 2)
            System.out.println("You are inside");
        if (x == 3)
            System.out.println("You are inside");

        if (y == 1)
            System.out.println("You are outside");
        if (y == 2)
            System.out.println("You are outside");
        if (y == 3)
            System.out.println("You are outside");
    }
}
