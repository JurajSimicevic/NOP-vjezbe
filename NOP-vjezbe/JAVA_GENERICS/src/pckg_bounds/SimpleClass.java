package pckg_bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleClass <T extends User> {

    private final List<T> users;

    public SimpleClass() {
        this.users = new ArrayList();
    }

    public SimpleClass(T[] arrUsrs){  // 9.10. - 2.glasovna 45.minuta  - konstruktor koji prima niz korisnika
        this.users = Arrays.asList(arrUsrs);
    }

    public void performSomething() {// 9.10. - 2.glasovna 47.50 minuta
        if (users.isEmpty()) {
            System.out.println("There is no users to perform something!");
        } else {
            for (T usr : users) {
                usr.performSomething();
            }
        }
    }
}
