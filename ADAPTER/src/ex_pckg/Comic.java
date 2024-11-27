package ex_pckg;

public class Comic {

    private String title;
    private String author;
    private int totalNumberOfPages;


    public Comic(String title, String author, int totalNumberOfPages) {
        this.title = title;
        this.author = author;
        this.totalNumberOfPages = totalNumberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    @Override
    public String toString() {
        return "Comic {" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", totalNumberOfPages = " + totalNumberOfPages +
                '}';
    }
}
