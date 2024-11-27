package ex_pckg;

public class FSTBookReader implements BookReader {

    private Book book;
    private int currentPage;
    private int numPages;
    private static final int MAXPERC = 150;
    private static final int MINPERC = 50;
    private int zoom;


    public void setBook(Book book) {
        this.book = book;
        this.currentPage = 1;
        this.numPages = book.getTotalNumberOfPages();
        this.zoom = 100;
        System.out.println(book);
        System.out.println("--------------------------------------");
        System.out.println(this);
    }


    public FSTBookReader(){
        System.out.println("Book reader ready for reading some books!");
    }
    @Override
    public void viewPage(int page) throws PageOutOfRange {
        if (book != null){
            if (page < numPages){
                this.currentPage = page;
                System.out.println("Viewing page " + page);
            } else {
                throw new PageOutOfRange();
            }
        }
    }

    @Override
    public void nextPage() {
        if (book != null){
            if (currentPage < numPages){
                this.currentPage++;
                System.out.println("Went to next page.");
            } else {
                System.out.println("Nuh uh");
            }
        }

    }

    @Override
    public void previousPage() {
        if (book != null){
            if (currentPage == 1){
                System.out.println("Already on the first page!");
            } else {
                this.currentPage--;
                System.out.println("Went to previous page.");
            }
        }
    }

    @Override
    public int activePage() {
        return currentPage;
    }

    @Override
    public void goToLastPage() {
        if (book != null){
            if (currentPage == numPages){
                System.out.println("Already on the last page!");
            } else {
                this.currentPage = numPages;
                System.out.println("Went to the last page.");
            }
        }
    }

    @Override
    public void goToFirstPage() {
        if (book != null){
            if (currentPage == 1){
                System.out.println("Already on the first page!");
            } else {
                this.currentPage = 1;
                System.out.println("Went to the first page.");
            }
        }
    }

    @Override
    public void zoom(int percentage) {
        if(book != null){
            if (percentage > MAXPERC || percentage < MINPERC){
                System.out.println("Can't zoom over 150% or less than 50%!");
            } else {
                this.zoom = percentage;
                System.out.println("Zoom set to: " + zoom);
            }
        }
    }

    @Override
    public String toString() {
        return "FSTBookReader{" +
                "book=" + book +
                ", currentPage=" + currentPage +
                ", numPages=" + numPages +
                ", zoom=" + zoom +
                '}';
    }

    @Override
    public void setBookToRead() {

    }
}
