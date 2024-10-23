package pckg_intro;

import java.util.ArrayList;

public class AppIntro {

    // ako želimo koristiti neku metodu unutar main metode (koja je static), ta metoda mora biti isto static
    // za static ne moramo instacirati objekt klase da bi pozvali metodu
    // za metode koje nisu static moramo instancirati objekt klase da bi pozvali metodu
    public static void main(String[] args) {
        ArrayList<User> lst = new ArrayList();
//        lst.add(100);
//        lst.add("Something");
//        lst.add(23.57);
//        lst.add(2E11);
        lst.add(new User("Zoki"));
        listElements(lst);
        System.out.println(new User("Ime1"));
    }

    private static void listElements(ArrayList lista) {
        int lngth = lista.size();
        for (int k = 0; k < lngth; k++) {
            System.out.println("Element: " + lista.get(k));
        }
    }

    private static void listElementsFromList(ArrayList<User> lst) {
        for (User user : lst) {
            System.out.println(user);
        }
    }
}
