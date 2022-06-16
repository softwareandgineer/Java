public class AP01TypeConversion { //create new class and define variables
    int m = 45;
    int n = 16;
    double x;

    public static void main(String[] args) //create a function to run the calculations
    {
        AP01TypeConversion a = new AP01TypeConversion(); //must create an object to use non-static number variables
        a.x = (double) (a.m/a.n); //(double) converts the calculation of m/n into a double value only after the process
        System.out.println("The value of m/n converted to a double after its calculation as ints is " + a.x);
        System.out.println("An alternative option would be to convert an int before the calculation");
        System.out.println(a.m/(double)a.n); //this converts n to a double, allowing it to be more precise
    }
}


