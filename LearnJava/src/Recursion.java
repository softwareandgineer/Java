public class Recursion {

    static int fibonacci(int x){
        if(x == 0)
            return 0;
        if(x == 1)
            return 1;
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
    static int factorial(int n){
        if(n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    static int sum(int[] array, int i, int j)
    {
        if (i+1 == j)
            return array[i];
        return array[i] + sum(array, i+1, j);
    }

    static int sum(int[] array)
    {
        return sum(array, 0, array.length);
    }
    public static void main(String[] args)
    {
        System.out.println("factorial of 5 is: " + factorial(5));
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int result = sum(arr);
        System.out.println("sum of 1-9 is: " + result);
        int x = 10;
        System.out.println("fibonacci sequence up to 10 is: " + fibonacci(x));
    }
}
