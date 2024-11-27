package ex_pckg;

public class Client {

    private ComicReader comicReader;

    public Client(){
        System.out.println("Some client that expects ComicReader");
    }

    public void setComicReader(ComicReader comicReader){
        this.comicReader = comicReader;
    }

    public void skipToNextPage(){
        comicReader.next();
    }

    public void skipToPreviousPage(){
        comicReader.previous();
    }

    public void skipToLastPage(){
        comicReader.last();
    }

    public void skipToFirstPage(){
       comicReader.first();
    }

    public void setSomeZoom(int percent){
        comicReader.zoom(percent);
    }

    public void toggleNightMode(boolean status){
        comicReader.nightReadingMode(status);
    }

    public void getThisPage(int page){
        try{
            comicReader.gotoPage(page);
        }catch(PageOutOfRange por){
            System.out.println(por.getMessage());
        }
    }

    public void getCurrentPage(){
        comicReader.currentPage();
    }

    public void nightMode(boolean status){
        comicReader.nightReadingMode(status);
    }
}
