package pckg_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ListCLS<Integer> fstList = new ListCLS<>();
        fstList.addNewElement(100);
        fstList.addNewElement(200);
        fstList.addNewElement(-100);
        fstList.addNewElement(200);
        fstList.listAllElements();
        List<UserSND> users = new ArrayList<>();
        users.add(new UserSND("Franko"));
        AUX_CLS anotherList = new AUX_CLS();
//        anotherList.addNewElement(new UserSND("Eva"), users);
//        anotherList.listAllElements(users);

    }
}
