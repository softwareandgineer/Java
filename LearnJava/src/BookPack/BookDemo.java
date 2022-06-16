package BookPack;

public class BookDemo {
    public static void main(String[] args)
    {
        Book books[] = new Book[4];

        books[0] = new Book("PP Land", "Bobby J.", 1945);
        books[1] = new Book("Uh Oh Stinky", "Schmieder.", 1942);
        books[2] = new Book("The Fourth Reich", "Adolf H.", 1945);
        books[3] = new BookInStore("Python", "Tom H.", 2022, 2);

        for(int i = 0; i < books.length; i++)
            books[i].Show();

    }

}
