import java.util.Scanner;
public class Exercise2_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t respectively");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.println("The avg accel is equal to: " + a);
    }
}
