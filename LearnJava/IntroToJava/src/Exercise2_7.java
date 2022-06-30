import java.util.Scanner;
public class Exercise2_7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of minutes:");
        int min = input.nextInt();

        int year = min / 525600;
        int m = min % 525600;
        int day = m / 1440;

        System.out.println(min + " minutes is equal to " + year + " years and " + day + " days");
    }
}
