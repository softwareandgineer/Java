import java.util.Scanner;
public class Exercise3_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the day of the week and the days elapsed respectively");
        int day = input.nextInt();
        int elapsed = input.nextInt();

        switch (day) {
            case 0 -> System.out.println("The day is Sunday");
            case 1 -> System.out.println("The day is Monday");
            case 2 -> System.out.println("The day is Tuesday");
            case 3 -> System.out.println("The day is Wednesday");
            case 4 -> System.out.println("The day is Thursday");
            case 5 -> System.out.println("The day is Friday");
            case 6 -> System.out.println("The day is Saturday");
        }

        int e = elapsed % 7;
        int d = (day + e) % 7;
        switch (d) {
            case 0 -> System.out.println("The future day is Sunday");
            case 1 -> System.out.println("The future day is Monday");
            case 2 -> System.out.println("The future day is Tuesday");
            case 3 -> System.out.println("The future day is Wednesday");
            case 4 -> System.out.println("The future day is Thursday");
            case 5 -> System.out.println("The future day is Friday");
            case 6 -> System.out.println("The future day is Saturday");
        }
    }
}

