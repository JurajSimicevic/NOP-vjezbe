package ex_pckg;

public class AppTest {

    public static void main(String[] args) {
        Comic comic = new Comic("Captain America", "DT & CH", 100);
        SimpleComicReader comicReader = new SimpleComicReader();
        comicReader.setComic(comic);
        Client client = new Client();
        client.setComicReader(comicReader);
        client.skipToNextPage();
        client.getThisPage(99);
        client.nightMode(false);
        Book book = new Book("The last principle", "A.G. Marty", 230);
        FSTBookReader bookReader = new FSTBookReader();
        bookReader.setBook(book);
        BookToComicAdapter adapter = new BookToComicAdapter(bookReader);
        client.setComicReader(adapter);
        client.nightMode(false);
    }
}
