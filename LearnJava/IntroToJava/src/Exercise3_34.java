import java.util.Scanner;

public class Exercise3_34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for p0, p1, and p2");
        float x0 = input.nextFloat();
        float y0 = input.nextFloat();
        float x1 = input.nextFloat();
        float y1 = input.nextFloat();
        float x2 = input.nextFloat();
        float y2 = input.nextFloat();
        float n = (x1 - x0) * (y2 - y0) * (y1 - y0);
        if(x1 == x2 || y1 == y2){
            System.out.println("P1 has points with P2");
            return;
        }
        if(x1 == x0 || y1 == y0){
            System.out.println("P1 has points with P0");
            return;
        }
        if(x0 == x2 || y0 == y2){
            System.out.println("P0 has points with P2");
            return;
        }
    }
}
