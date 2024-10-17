package pckg_wildcard;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS <E>{

    private final List<E> someList;

    public MultiListCLS() {
        this.someList = new ArrayList<E>();
    }

    public MultiListCLS(List<E> someList) {
        this.someList = someList;
    }

    public void listAllElements(){
        if(this.someList.size() == 0){
            System.out.println("List is empty");
        } else {
            for(E e: this.someList){
                System.out.println(e);
            }
        }
    }

    public void compareTwoList(List<?> anotherList){
        System.out.println(this.someList.size() - anotherList.size());
    }
}
