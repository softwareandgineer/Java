import java.util.Scanner;
public class Exercise2_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the x1, y1, x2, y2, x3, y3 coordinates of a triangle");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double a1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double a2 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);
        double a3 = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2);

        double d1 = Math.pow(a1 , 0.5);
        double d2 = Math.pow(a2 , 0.5);
        double d3 = Math.pow(a3 , 0.5);

        double s = (d1 + d2 + d3) / 2;
        double a4 = s * (s - d1) * (s - d2) * (s - d3);
        double area = Math.pow(a4 , 0.5);

        System.out.println("The area of the triangle is: " + area);


    }
}
