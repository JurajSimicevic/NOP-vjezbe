package pckg_arrayList_cmd_problem;

import java.util.Stack;

public class ArrayListController {

    private Stack<CommandOnList> undoStack;
    private Stack<CommandOnList> redoStack;
    private CommandOnList currentCommand;

    public ArrayListController() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setCommand(CommandOnList command) {
        this.currentCommand = command;
    }

    public void runCommand(){
        if(currentCommand != null){
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        } else {
            System.out.println("Set some command on list!");
        }
    }

    public void undoCommand(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo! - undo stack is empty!");
        } else {
            currentCommand = undoStack.pop();
            currentCommand.undoCommand();
            redoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }
    }

    public void redoCommand(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to undo! - undo stack is empty!");
        } else {
            currentCommand = redoStack.pop();
            currentCommand.runCommand();
            undoStack.push(currentCommand);
        }
    }

    private void listUndoStack(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to list! - undo stack is empty!");
        } else {
            System.out.println("\n================================= Undo Stack =================================\n");
            for(CommandOnList cmd : undoStack){
                System.out.println(cmd);
            }
        }
    }

    private void listRedoStack(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to list! - redo stack is empty!");
        } else {
            System.out.println("\n================================= Redo Stack =================================\n");
            for(CommandOnList cmd : redoStack){
                System.out.println(cmd);
            }
        }
    }

}
