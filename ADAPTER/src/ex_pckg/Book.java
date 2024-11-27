package ex_pckg;

public class Book {

    private String title;
    private String author;
    private int totalNumberOfPages;


    public Book(String title, String author, int totalNumberOfPages) {
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
        return "Book {" +
                "title = '" + title + '\'' +
                ", author = '" + author + '\'' +
                ", totalNumberOfPages = " + totalNumberOfPages +
                '}';
    }
}
