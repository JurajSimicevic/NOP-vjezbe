package pckg_arrayList_cmd_problem;

import java.util.ArrayList;

public class RemoveElementFromList<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private E element;
    private boolean flag;

    public RemoveElementFromList(ArrayList<E> list, E element) {
        this.flag = false;
        this.list = list;
        this.element = element;
    }

    @Override
    public void runCommand() {
        if(list.contains(element)){
            flag = list.remove(element);
            System.out.println("\nElement removed from the list | type of element: " + element.getClass().getSimpleName());
        } else {
            System.out.println("\nNothing to remove from the list!");
        }
    }

    @Override
    public void undoCommand() {
        if(flag){
            list.add(element);
            System.out.println("\nUndid the 'remove element' command. Element added to the list!");
            flag = false;
        } else {
            System.out.println("\nNothing to undo!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + " @" + Integer.toHexString(hashCode());
    }
}
