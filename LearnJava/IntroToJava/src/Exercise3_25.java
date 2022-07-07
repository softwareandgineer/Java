import java.util.Scanner;
public class Exercise3_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 y1 x2 y2 x3 y3 and x4 y4 respectively");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double x = (y1 - y2) * x1 - (x1 - x2) * y1;
        double y = (y3 - y4) * x3 - (x3 - x4) * y4;

        System.out.println("The intersects are at " + x + " and " + y);
    }
}
