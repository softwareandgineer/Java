public class CaseConverter {
    public char convert(char c)
    {
        if( c >= 'a' && c <= 'z')
            return toUpperCase(c);
        else
            return toLowerCase(c);
    }

    public char toUpperCase(char c)
    {
        return (char) ((int)c & (~32));
    }

    public char toLowerCase(char c)
    {
        return (char) ((int)c | 32);
    }

    public static void main(String[] args)
    {
        CaseConverter converter = new CaseConverter();
        for(char c = 'a'; c <= 'z'; c++)
        {
            System.out.print(c);
            System.out.print(converter.convert(c));
            System.out.print(" ");
        }
        System.out.println();

        for(char c = 'A'; c <= 'Z'; c++)
        {
            System.out.print(c);
            System.out.print(converter.convert(c));
            System.out.print(" ");
        }
        System.out.println();
    }
}

