import java.util.Scanner;
public class Exercise3_3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 values in double");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double temp = a * d - b * c;
        if(Math.abs(temp) < 0.0001){
            System.out.print("There is no solution");
            return;
        }

        double x = (e * d - b * f) / temp;
        double y = (a * f - e * c) / temp;

        System.out.println("X and Y values are " + x + " and " + y);

    }
}
