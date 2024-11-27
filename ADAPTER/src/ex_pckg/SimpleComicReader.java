package ex_pckg;

public class SimpleComicReader implements ComicReader{

    private Comic comic;
    private int currentPage;
    private int totalPages;
    private static final int MAXPERC = 200;
    private static final int MINPERC = 20;
    private int zoom;
    private boolean nightReadingMode;

    public SimpleComicReader() {
        System.out.println("Ready to read some comics...");
        System.out.println("Please provide some comic to read!");
        this.nightReadingMode = false;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
        this.currentPage = 1;
        totalPages = comic.getTotalNumberOfPages();
        this.zoom = 100;
        System.out.println("Currently reading: ");
        System.out.println(comic);
        System.out.println("----------------------------------------");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SimpleComicReader{" +
                "currentPage=" + currentPage +
                ", totalPages=" + totalPages +
                ", nightReadingMode=" + nightReadingMode +
                ", zoom=" + zoom +
                '}';
    }

    @Override
    public void gotoPage(int numPage) throws PageOutOfRange {
        if (comic != null){
            if (numPage <= totalPages){
                this.currentPage = numPage;
                System.out.println("We are on the page: " + numPage);
            } else {
                throw new PageOutOfRange();
            }
        }
    }

    @Override
    public void next() {
        if (comic != null) {
            if (currentPage < totalPages) {
                this.currentPage++;
                System.out.println("Next page is opened: " + currentPage);
            } else {
                System.out.println("Last page opened - can't go any further!");
            }
        }
    }

    @Override
    public int currentPage() {
        return currentPage;
    }

    @Override
    public void previous() {
        if(comic != null){
            if(currentPage == 1){
                System.out.println("Can't go to previous page - You are on a 1st page!");
            } else {
                this.currentPage--;
                System.out.println("Going one page back: " + currentPage);
            }
        }
    }

    @Override
    public void last() {
        if (comic != null) {
            this.currentPage = totalPages;
            System.out.println("Jumped to the last page: " + currentPage);
        }
    }

    @Override
    public void first() {
        if (comic != null) {
            if (currentPage == 1) {
                System.out.println("You are already on the 1st page!");
            } else {
                currentPage = 1;
            }
        }
    }

    @Override
    public void zoom(int percentage) {
        if(comic != null){
            if (percentage > MAXPERC || percentage < MINPERC){
                System.out.println("Can't zoom over 200% or less than 20%!");
            } else {
                this.zoom = percentage;
                System.out.println("Zoom set to: " + zoom);
            }
        }
    }

    @Override
    public void nightReadingMode(boolean status) {
        if(comic != null){
            this.nightReadingMode = status;
            System.out.println("Night reading mode is on: " + nightReadingMode);
        }
    }

    @Override
    public void changeBrightness(int value) {
        
    }
}
