public class TestString {
    public static void main(String[] args)
    {
        String str1 = new String("Java strings are objects");
        String str2 = str1 + "!";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        if(str2 == str3)
            System.out.println("they are equal");
        else
            System.out.println("they are not equal");

        if(str2.equals(str3))
            System.out.println("they are equal");
        else
            System.out.println("they are not equal");


        for(int i = 0; i < str1.length(); i++)
        {
            char c = str1.charAt(i);
            System.out.println(c);
        }


        String s1 = "abc";
        String s2 = "xyz";
        String s3 = "abd";
        if(s1.compareTo(s2) < 0)
        {
            System.out.println(s1 + " is less than " + s2);
        }
        else if(s1.compareTo(s2) == 0)
        {
            System.out.println(s1 + " equals " + s2);
        }
        else
            System.out.println(s1 + " is less than " + s2);


        String testStr1 = "One Two Three One";
        System.out.println(testStr1.indexOf("One"));
        System.out.println(testStr1.lastIndexOf("One"));

        String[] arrayOfString = {"This", "is", "a", "string", "array"};
        for(String s: arrayOfString)
        {
            System.out.println(s);
        }

        String ss = testStr1.substring(1, 2);
        System.out.println(ss);

        String command = "e";
        switch(command)
        {
            case "e":
                System.out.println("Go east");
                break;
            case "s":
                System.out.println("Go south");
                break;
            case "n":
                System.out.println("Go north");
                break;
            case "w":
                System.out.println("Go west");
                break;
            default:
                System.out.println("Invalid direction  ");
                break;
        }

    }
}
