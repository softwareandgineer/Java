import java.util.Scanner;
public class Exercise3_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x and y coords");
        float x = input.nextFloat();
        float y = input.nextFloat();

        if (x > 5){
            System.out.println("You are outside the rectangle");
            return;
        }
        if (x < -5){
            System.out.println("You are outside the rectangle");
            return;
        }
        if (y > 2.5){
            System.out.println("You are outside the rectangle");
            return;
        }
        if (y < -2.5){
            System.out.println("You are outside the rectangle");
            return;
        }
        else{
            System.out.println("You are inside the rectangle");
        }
    }
}
