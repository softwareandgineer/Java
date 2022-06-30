//31,536,000 seconds per year
public class Exercise1_11 {
    public static void main(String[] args){
        System.out.println("Year 1");
        System.out.println(312032486 + 31536000 / 7 - 31536000 / 13 + 31536000 / 45);
        System.out.println("Year 2");
        System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 2);
        System.out.println("Year 3");
        System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 3);
        System.out.println("Year 4");
        System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 4);
        System.out.println("Year 5");
        System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 5);
    }

}
