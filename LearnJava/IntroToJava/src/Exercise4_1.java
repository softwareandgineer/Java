import java.util.Scanner;
public class Exercise4_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the centre of the pentagon to a vertex");
        float r = input.nextFloat();

        float s = (float) (2 * r * Math.sin(3.14 / 5));
        float a = (float) ((5 * s * s) / 4 * Math.tan(3.15 / 5));

        System.out.println("The area of the pentagon is " + a + "squared");
    }
}
