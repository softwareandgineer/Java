package BookPack;

public class Book {
    private String title;
    private String author;
    private int pubDate;

    protected int price; //only accessible by sub-classes

    Book(String t, String a, int p)
    {
        title = t;
        author = a;
        pubDate = p;
    }

    public void Show()
    {
        System.out.println("Title of Book: " + title);
        System.out.println("Author of Book: " + author);
        System.out.println("Date Published: " + pubDate);
    }
}
