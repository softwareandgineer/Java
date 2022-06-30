import java.util.Scanner;
public class Exercise2_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Print x1, y1, x2, and y2 respectively");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double d = Math.pow(a , 0.5);

        System.out.println("The total distance is " + d);
    }
}
