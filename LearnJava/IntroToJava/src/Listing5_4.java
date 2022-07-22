//Subtraction quiz loop
import java.util.Scanner;
public class Listing5_4 {
    public static void main(String[] args){
        final int num_of_questions = 5; //set the number of questions
        int correctCount = 0; //counter for the # of questions you answer correctly
        int count =- 0; //counter for questions
        long startTime = System.currentTimeMillis(); //sets the starting time to the current time
        Scanner input = new Scanner(System.in);

        while (count < num_of_questions) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            if (number2 > number1){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("What is " + number1 + " - " + number2 + "?");
            int answer = input.nextInt();

            if(number1 - number2 == answer){
                System.out.println("Correct");
                correctCount++;
            }
            else{
                System.out.println("Wrong");
                System.out.println("The answer should be " + (number1 - number2));
            }
            count++;
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("You got " + correctCount + " / " + "5 " + "questions right.");
        System.out.println("You took " + (testTime / 1000) + " seconds.");
    }
}
