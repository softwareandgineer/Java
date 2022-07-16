import java.util.Scanner;
public class Exercise4_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side length of the hexagon");
        float s = input.nextFloat();
        float a = (float) ((6 * s * s) / 4 * Math.tan(3.14 / 6));
        System.out.println("The area of the hexagon is " + a + "squared");
    }
}
