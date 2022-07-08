import java.util.Scanner;
public class Exercise3_32 {
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
        if(n > 0){
            System.out.println("P2 is on the left side of the line");
            return;
        }
        if(n < 0){
            System.out.println("P2 is on the right side of the line");
            return;
        }
        else{
            System.out.println("P2 is on the same side as the line");
        }

    }
}
