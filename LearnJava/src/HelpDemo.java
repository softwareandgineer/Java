public class HelpDemo {
    public static void main(String[] args) throws java.io.IOException
    {
        Help helper = new Help();

        for(;;){
            helper.showMenu();
            char choice = (char)System.in.read();

            char ignore;
            do {
                ignore = (char)System.in.read();
            }while(ignore != '\n');

            if(!helper.isValid(choice))
            {
                System.out.println("Invalid input");
                continue;
            }
            if(choice == 'q') {
                helper.cleanup();
                break;
            }
            helper.helpOn(choice);
        }

    }
}
