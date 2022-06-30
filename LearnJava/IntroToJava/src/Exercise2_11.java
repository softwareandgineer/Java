import java.util.Scanner;
public class Exercise2_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the years of population growth");
        int years = input.nextInt();
        int pop = (312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * years);

        System.out.println("The population after " + years + " years will be: " + pop);
    }
}
