/*
1. Byte is instructions processed by a software instead of by the hardware itself, which allows programming to be a lot
more flexible
2. Encapsulation, inheritance, and polymorphism.
3. In public static void main
4. Variable is a value that may be changeable and stores information
5.
    a) valid
    b) invalid
    c) valid
    d) invalid
6. single line comment = //
   multi line comment = slash* and *slash
7. if(x > 1) {
      System.out.println("x is larger than 1");
   }
   else
      System.out.println("x is smaller than 1");
8. Just create a class or java file and code
 */

//9.
class moonGravity {
    public static void main(String args[]) {
        double e = 9.8;
        System.out.println("The gravity on the moon is " + e * 0.17 + " m/s^2");
    }
}

//10.
class InToMTable {
    public static void main(String args[]){
        double inches, metres;
        int counter;

        counter = 0;
        for(inches = 1; inches <= 100; inches++) {
            metres = inches * 39.37;
            System.out.println(inches + " inches are " + metres + " metres.");

            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

/*
11. Syntax errors
12. Yes
 */










