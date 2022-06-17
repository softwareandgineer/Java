package BookPack;

public class ExceptionDemo {

    public static double mySqrt(double a) throws MyException {
        double result;
        if(a>0.0)
            result = Math.sqrt(a);
        else
            throw new MyException("Bad argument:" + a);
        return result;
    }

    public static void main(String[] args)
    {
        int num[] = new int[4];
        int denom[] = {1,2,3,0};

        for(int i = 0; i < 4; i++) {
            num[i] = i * 10;
        }

        try
        {
            double r = mySqrt(-1.0);
            for(int i = 0; i < 4; i++)
            {
                System.out.println(num[i]/denom[i]);
            }

            for(int i = 0; i < 5; i++)
            {
                System.out.println(num[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e)
        {
            System.out.println("error: " + e.getMessage());
        }

        catch(Throwable e)
        {
            System.out.println("Error:" + e);
        }

        finally
        {
            System.out.println("nice");
        }
    }
}
