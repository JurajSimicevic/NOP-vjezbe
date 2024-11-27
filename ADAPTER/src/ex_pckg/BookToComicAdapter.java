package ex_pckg;

public class BookToComicAdapter implements ComicReader{

    private BookReader bookReader;

    public BookToComicAdapter(BookReader bookReader) {
        this.bookReader = bookReader;
    }

    @Override
    public void gotoPage(int numPage) throws PageOutOfRange {
        bookReader.viewPage(numPage);
    }

    @Override
    public void next() {
        bookReader.nextPage();
    }

    @Override
    public int currentPage() {
        return bookReader.activePage();
    }

    @Override
    public void previous() {
        bookReader.previousPage();
    }

    @Override
    public void last() {
        bookReader.previousPage();
    }

    @Override
    public void first() {
        bookReader.goToFirstPage();
    }

    @Override
    public void zoom(int percentage) {
        bookReader.zoom(percentage);
    }

    @Override
    public void nightReadingMode(boolean status) {
        System.out.println("Sorry! This functionality is not supported!");
    }

    @Override
    public void changeBrightness(int value) {

    }
}
