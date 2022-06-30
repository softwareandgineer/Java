import java.util.Scanner;
public class Exercise2_1 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double miles = input.nextDouble();
      double km = miles * 1.6;
      System.out.print(miles + "Miles into kilometres is: " + km);
   }
}
