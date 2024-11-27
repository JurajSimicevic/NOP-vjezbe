package pckg_arrayList_cmd_problem;

import java.util.ArrayList;

public class AddNewElementToList<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private E element;

    public AddNewElementToList(ArrayList<E> list, E element) {
        this.list = list;
        this.element = element;
    }


    @Override
    public void runCommand() {
        if(element == null){
            System.out.println("Can not add null element to a list!");
        } else if (list.contains(element)) {
            System.out.println("\nCan not add duplicates - element already in a list!");
        } else {
            list.add(element);
            System.out.println("\nElement added to the list | type of element: " + element.getClass().getSimpleName());

        }
    }

    @Override
    public void undoCommand() {
        if (list.contains(element)){
            list.remove(element);
            System.out.println("Undid 'add new element'. Element removed");
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + " @" + Integer.toHexString(hashCode());
    }
}
