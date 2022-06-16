package BookPack;

public interface Series {
    int DEFAULT_START = 0;

    default void reset()
    {
        setStart(DEFAULT_START);
    }

    public void setStart(int x);

    public int getNext();
}
