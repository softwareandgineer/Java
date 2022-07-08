import java.util.Scanner;
public class Exercise3_28 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x and y co-ords of the centre for rectangle 1");
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        System.out.println("Enter the x and y co-ords of the centre for rectangle 2");
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        System.out.println("Enter the width and height of rectangle 1");
        float w1 = input.nextFloat();
        float h1 = input.nextFloat();
        System.out.println("Enter the width and height of rectangle 2");
        float w2 = input.nextFloat();
        float h2 = input.nextFloat();

        if (x1 + w1 > x2 + w2){
            System.out.println("You are inside");
            return;
        }
        if (x1 + w1 < x2 + w2){
            System.out.println("You are outside");
            return;
        }
        if (y1 + h1 < y2 + h2){
            System.out.println("You are inside");
            return;
        }
        if (y1 + h1 > y2 + h2){
            System.out.println("You are outside");
        }
    }
}
