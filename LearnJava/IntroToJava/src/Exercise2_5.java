import java.util.Scanner;
public class Exercise2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the subtotal and gratuity rate respectively:");
        int subtotal = input.nextInt();
        int gratuity = input.nextInt();

        float g = (float)(subtotal * (gratuity / 100.0));
        float t = (float)(g + subtotal);

        System.out.println("The gratuity is " + g + ", and the total is " + t);
    }
}
