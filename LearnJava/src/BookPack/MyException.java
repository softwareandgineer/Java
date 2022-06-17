package BookPack;

public class MyException extends Exception{
    MyException(String str){
        this.str = str;
    }

    public String toString(){
        return "MyException" + str;
    }
    private String str;
}
