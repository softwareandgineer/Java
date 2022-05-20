public class Help {
    void helpOn(int what){
        switch (what){
            case '1':
                doHelpOnIf();
                break;
            case '2':
                doHelpOnSwitch();
                break;
            case '3':
                doHelpOnFor();
                break;
        }
    }
    void doHelpOnIf(){
        System.out.println("Usage of If:");
        System.out.println("\t if(condition) statement;");
        System.out.println("\t else statement;");
    }

    void doHelpOnSwitch(){
        System.out.println("Usage of Switch:");
        System.out.println("\t switch(expression)");
        System.out.println("\t case constant: statement;");
        System.out.println("\t }");
    }

    void doHelpOnFor() {
        System.out.println("Usage of For:");
        System.out.println("\t For(expression)");
    }

    void showMenu(){
        System.out.println("Menu");
        System.out.println("\t 1");
        System.out.println("\t 2");
        System.out.println("\t 3");
    }

    boolean isValid(int ch){
        if(ch != '1' && ch != '2' && ch !='3' && ch !='q')
            return false;
        else
            return true;
    }

    protected void cleanup()
    {
        System.out.println("I have done some cleanups");
    }

}
