package BookPack;

public class BookInStore extends Book{
    BookInStore(String t, String a, int p, int price)
    {
        super(t, a, p);
        this.price = price;
    }

    public void Show() {
        super.Show();
        System.out.println("price = " + price);
    }
}
