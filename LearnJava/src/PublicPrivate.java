public class PublicPrivate {
    private int alpha;
    public int beta;
    int gamma; // default

    void setAlpha(int a)
    {
        alpha = a;
        printAlpha();
    }
    private void printAlpha()
    {
        System.out.println("alpha=" + alpha);
    }
    private void printBeta()
    {
        System.out.println("beta=" + beta);
    }

    public void setBeta(int Beta) {
        this.beta = beta;
        printBeta();
    }
}

class PublicPrivateTest{
    public static void main(String[]  args)
    {
        PublicPrivate demo = new PublicPrivate();
        demo.setAlpha(1234);
        demo.setBeta(5678);
    }
}
