import java.util.Scanner;
public class Exercise3_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, r1, and r2, respectively");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r1 = input.nextDouble();
        double r2 = input.nextDouble();

        double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        if (d > r1 + r2) {
            System.out.println("They are lying outside each other");
            return;
        }

        if (d < Math.abs(r1 - r2)) {
            System.out.println("They are inside each other");
            return;
        }

        if (Math.abs(r1 - r2) < d) {
            System.out.println("They are overlapping");
        }

    }
}
