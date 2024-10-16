package pckg_bounds;

public abstract class Person {  // apstraktna klasa- iz nje se ne može kreirati konkretni objekt, nju koristimo za nasljeđivanje, extendaju je druge klase

    protected String name;

    //public konstruktor za apstraktnu klasu nema smisla jer ionako nećemo raditi konkrektne objekte iz apstraktne klase

    protected Person (String name) {  // protected - modifikator pristupa, da je bio private, ne bi mogli pristupiti iz klase User - nastaje problem u klasi User
        this.name = name;
    }

    public abstract void someMethod(String content);  // apstraktna metoda - nema tijela, nema {} - metoda koja nema tijelo, a mora se implementirati u klasi koja nasljeđuje apstraktnu klasu
}
