/*
1. To ensure portability across platforms
2. Java's character type is char and its characters are Unicode which may differ
3. Only contains true(1) or false(0)
4. System.out.println("One \n" + "Two \n" + "Three \n");
5. Sum variable must be outside the function and declared as 0
6. Prefix is a notation that writes the operator before operands while the postfix is a notation that writes the
operator after the operands.
7. Use && to prevent the division
8. For data types which represents storage
9. Converting data from one data type to another data type
*/

//10.
class PrimeNumbers
{
    public static void main (String[] args)
    {
        int i = 0;
        int num = 0;
        String pm = "";

        for (i = 1; i <= 100; i++)
        {
            int count = 0;
            for(num = i; num >= 1; num--)
            {
                if(i % num==0)
                {
                    count = count + 1;
                }
            }if (count == 2)
        {
            pm = pm + i + " ";
        }
        }
        System.out.println("Prime numbers from 1 to 100 are: " + pm);
    }
}

//11. No
//12. Yes
