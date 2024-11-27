package pckg_arrayList_cmd_problem;

import java.util.ArrayList;
import java.util.Arrays;

public class ClearAllElements<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private final ArrayList<E> backupList;

    public ClearAllElements(ArrayList<E> list) {
        this.list = list;
        this.backupList = new ArrayList<>();
    }
    @Override
    public void runCommand() {
        if(list.isEmpty()){
            System.out.println("Can't clear an empty list!");
        } else {
            backupList.addAll(list);
            list.clear();
            System.out.println("\nList is cleared!");
        }
    }

    @Override
    public void undoCommand() {
        if(backupList.isEmpty()){
            System.out.println("Nothing to undo!");
        } else {
            list.addAll(backupList);
            backupList.clear();
            System.out.println("\nUndid 'clear' command!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + " @" + Integer.toHexString(hashCode());
    }
}
