//Order two cities
import java.util.Scanner;
public class Listing4_2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city");
        Float city1 = input.nextFloat();
        System.out.print("Enter the second city");
        Float city2 = input.nextFloat();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        else
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
    }
}
