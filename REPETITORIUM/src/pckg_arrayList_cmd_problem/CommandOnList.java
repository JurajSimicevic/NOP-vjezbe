package pckg_arrayList_cmd_problem;

public interface CommandOnList<E> {

    void runCommand();
    void undoCommand();
}
