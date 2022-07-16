import java.util.Scanner;
public class Exercise4_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int n = input.nextInt();
        System.out.println("Enter the side length");
        float s = input.nextFloat();

        float a = (float) ((n * s * s) / 4 * Math.tan(3.14 / n));
        System.out.println("The area of your polygon is " + a + "squared");
    }
}
