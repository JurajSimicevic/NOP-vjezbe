package pckg_intro;

public class User {

    private int id;  //atribut = polje

    // static -atribut na nivou klase - znači da je vezan za klasu, a ne za objekt
    // svi objekti će imati istu vrijednost tog polja koji je static, odnosno 100
    private static int cntID = 100;  //atribut = polje
    private String name;  //atribut = polje


    // konstruktor - mehanizam pomoću kojeg možemo definirati objekte klase
    // constructor overload - preopterećenje konstruktora - više konstruktora s različitim brojem parametara
    public User (String name){
        this.name = name; // this zamjenjuje konkretni objekt, this koristimo kad je ime parametra i polja isto
        id = cntID++; //nema this
    }

    public User (String name, int id){
        this.name = name;
        this.id = id;
    }

    // override - umjesto metode iz nadklase koristi se metoda iz podklase
    // overrideom smo nadjačali metodu tostring od klase objecta
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
