package ex_pckg;

public interface ComicReader {

    // metoda za "skok" na željenu stranicu
    void gotoPage(int numPage) throws PageOutOfRange;

    // metoda za prelazak na sljedeću stranicu
    void next();

    // metoda koja daje trenutačnu stranicu
    int currentPage();

    // metoda koja vraća prethodnu stranicu
    void previous();

    // metoda koja omogućuje
    void last();

    void first();

    void zoom (int percentage);

    void nightReadingMode(boolean status);

    void changeBrightness(int value);
}
