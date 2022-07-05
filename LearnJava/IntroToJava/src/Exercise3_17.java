import java.util.Scanner;
public class Exercise3_17 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Scissor(0) Rock(1) Paper(2)");
        int i = input.nextInt();
        int n = (int)(Math.random() * 3);

        switch(n){
            case 0 -> System.out.println("PC chose Scissor");
            case 1 -> System.out.println("PC chose Rock");
            case 2 -> System.out.println("PC chose Paper");
        }

        if (i == n)
            System.out.println("You tie!");
        else if (i == 1 && n == 2)
            System.out.println("You lose!");
        else if (i == 1 && n == 0)
            System.out.println("You win!");
        else if (i == 2 && n == 1)
            System.out.println("You win!");
        else if (i == 2 && n == 0)
            System.out.println("You lose!");

    }
}
