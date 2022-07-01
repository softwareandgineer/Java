//Compute and Interpret BMI
import java.util.Scanner;
public class Listing3_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds");
        double w = input.nextDouble();
        System.out.println("Enter your height in inches");
        double h = input.nextDouble();

        //enter these two constants
        final double kg_per_lb = 0.45359237;
        final double m_per_in = 0.0254;

        //compute bmi
        double weightInKilograms = w * kg_per_lb;
        double heightInMeters = h * m_per_in;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        //Display results
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
