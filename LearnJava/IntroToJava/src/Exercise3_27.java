import java.util.Scanner;
public class Exercise3_27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x and y coordinates");
        float x = input.nextFloat();
        float y = input.nextFloat();

        if(x < 0){
            System.out.println("You are outside the triangle");
        }
        if(x > 200){
            System.out.println("You are outside the triangle");
        }
        if(y < 0){
            System.out.println("You are outside the triangle");
        }
        if(x < 100){
            System.out.println("You are outside the triangle");
        }
        if(x + y > 200){
            System.out.println("You are outside the triangle");
        }
        else{
            System.out.println("You are inside the triangele");
        }

    }
}
