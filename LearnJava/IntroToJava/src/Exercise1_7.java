public class Exercise1_7 {
    public static void main(String[] args){
        System.out.println("pi is approximated to: ");
        System.out.println(4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11));
        System.out.println("it can also be approximated more accurately to: ");
        System.out.println(4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13));
    }
}
