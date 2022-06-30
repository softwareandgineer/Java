//Show current time
public class Listing2_7 {
    public static void main(String[] args){
        long totalMilliseconds = System.currentTimeMillis(); //Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000; //Total seconds since midnight, Jan 1, 1970
        //Calculates the current second in the current minute in the current hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
