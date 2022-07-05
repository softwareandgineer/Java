import java.util.Scanner;
public class Exercise3_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year (e.g. 2012)");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12");
        int month = input.nextInt();
        System.out.println("Enter the day of the month: 1-31");
        int dayOfMonth = input.nextInt();

        if (month == 1){
            month = 13;
            year -= 1;
        }

        if (month == 2){
            month = 14;
            year -= 1;
        }

        int q = dayOfMonth;
        int m = month;
        int j = year / 100;
        int k = year % 100;

        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        switch (h) {
            case 0 -> System.out.println("The day is Saturday");
            case 1 -> System.out.println("The day is Sunday");
            case 2 -> System.out.println("The day is Monday");
            case 3 -> System.out.println("The day is Tuesday");
            case 4 -> System.out.println("The day is Wednesday");
            case 5 -> System.out.println("The day is Thursday");
            case 6 -> System.out.println("The day is Friday");
        }
    }
}
