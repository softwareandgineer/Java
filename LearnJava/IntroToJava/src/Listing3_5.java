//Compute tax
import java.util.Scanner;
public class Listing3_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or " + "qualifying widow(er), " +
                "2-married separately, 3-head of " + "household) Enter the filing status: ");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;
        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 822250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

            //INCOMPLETE
        }
    }
}