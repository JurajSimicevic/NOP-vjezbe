package pckg_wildcard;

import pckg_bounds_snd.User;

import java.util.ArrayList;
import java.util.List;

public class AUX_CLS {

    private static List<?> users = new ArrayList<>();

    public static void processNamesInList(List<? extends UserSND> lst){
        for(UserSND u : lst){
            System.out.println("Name: " + u.getName());
        }
    }

//    public static void addSomeUser(List<? extends User> lst, UserSND user){
//        lst.add(user);
//    }

    public static void addNewUser(List<? super UserSND> lst){
//        users.add(new UserSND("Ime"));
    }

    public static <T extends UserSND> void processList(List<T> lst, T newElement){
        for(T element : lst){
            System.out.println(element);
        }

        lst.add(newElement);
    }
}
