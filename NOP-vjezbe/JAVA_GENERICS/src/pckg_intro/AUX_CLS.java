package pckg_intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AUX_CLS {

    public static void listStringList(ArrayList<String> lst) {
        if (lst.isEmpty()){
            System.out.println("Lista je prazna");
        } else {
            for (String element : lst) {
                System.out.println("element:" + element);
            }
        }
    }

    public static void listIntList(ArrayList<Integer> lst) {
        for (Integer intEl : lst) {
            System.out.println("element:" + intEl);
        }
    }

    public static void listUserList(ArrayList<User> lst) {
        for (User usr : lst) {
            System.out.println("element:" + usr);
        }
    }


    public static <E> void listElements(ArrayList<E> someList) {
        if (someList.isEmpty()) {
            System.out.println("List is empty - nothing to show!");
        } else {
            for (E element : someList) {
                System.out.println("Element: " + element);
            }
        }
    }

    // overload metode - isto ime ali MORA imati drugačiji parametar

    public static <Q> void listElementsVerSnd(ArrayList<Q> someList) {
        Iterator<Q> iter = someList.iterator();
        while (iter.hasNext()) {
            System.out.println("element: " + iter.next());
        }
    }

    public static <K,V> void listMapElements(HashMap<K,V> map){
        if (map.isEmpty()){
            System.out.println("Mapa je prazna...");
        } else {
            System.out.println("Mapa details as object: " + Integer.toHexString(map.hashCode()));
            for (Map.Entry<K,V> entry : map.entrySet()){ {
                System.out.println("Key: " + entry.getKey());
                System.out.println("Value: " + entry.getValue());
            }
        }
    }
}
}
