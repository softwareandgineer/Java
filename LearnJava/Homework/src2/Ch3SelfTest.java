import java.security.KeyStore;

class ReadKeys {
    public static void main(String[] args) throws java.io.IOException
    {
        char ch;
        int spaces = 0;
        System.out.println("Program breaks when period is entered");
        do {
            ch = (char) System.in.read();
            if (ch == ' ')
                spaces++;
        }   while(ch != '.');

        System.out.println("There were: " + spaces + " spaces.");
    }
}

/*
2.
if(condition)
elif(condition)
else
statement

3. To if(x < 10)

4. for(int i = 1000; i >= 0; i -= 2)

5. Not valid, 'i' is not declared outside the for loop

6. Break terminates program

7. after while

8.
0 1
2 3
4 5
6 7
8 9

9.
 */

class ForLoop {
    public static void main(String[] args)
    {
        for(int i = 1; i < 100; i += i)
            System.out.print(i + " ");

    }
}


//10.


class Changes {
    public static void main(String[] args) throws java.io.IOException
    {
        char ch;
        int changes = 0;
        System.out.println("Program breaks when period is entered");
        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            else if (ch >= 'A' & ch <= 'Z'){
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while(ch != '.');
        System.out.println("There were: " + changes + " changes.");
    }
}

/*
11.
A loop that runs infinitely

12.
Yes
 */
