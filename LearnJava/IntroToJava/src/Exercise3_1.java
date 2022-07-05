//Quadratic Formula
import java.util.Scanner;
public class Exercise3_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input values for a, b, and c, for the two roots of a quadratic equation");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        float bn = (float)(b * (-1.0));
        float r125 = (float)((b * b) - (4 * a * c));
        float r12 = (float)Math.pow(r125, 0.5);
        float r1 = (float)((bn + r12) / (2 * a));
        float r2 = (float)((bn - r12) / (2 * a));

        System.out.print("Your two roots are " + r1 + " and " + r2);
    }
}
