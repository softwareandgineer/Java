package BookPack;

public class ByTwos implements Series{
    private int val;
    private int start;
    @Override
    public void reset() {
        val = start;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = start;
    }

    @Override
    public int getNext() {
        val += 2;
        return val ;
    }
}
