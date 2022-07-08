public class Exercise3_24 {
    public static void main(String[] args){
        String c = null;
        String t = null;
        int a = (int) (Math.random() * 13);
        int b = (int) (Math.random() * 4);
        switch (a) {
            case 0 -> c = "Ace";
            case 1 -> c = "2";
            case 2 -> c = "3";
            case 3 -> c = "4";
            case 4 -> c = "5";
            case 5 -> c = "6";
            case 6 -> c = "7";
            case 7 -> c = "8";
            case 8 -> c = "9";
            case 9 -> c = "10";
            case 10 -> c = "Jack";
            case 11 -> c = "Queen";
            case 12 -> c = "King";
        }
        switch (b) {
            case 0 -> t = "Clubs";
            case 1 -> t = "Diamonds";
            case 2 -> t = "Hearts";
            case 3 -> t = "Spades";
        }

        System.out.println("You chose the " + c + " of " + t);

    }
}
