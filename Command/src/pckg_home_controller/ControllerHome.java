package pckg_home_controller;

import java.util.Stack;

public class ControllerHome {

    private Command command;
    private final Stack<Command> undoStack;
    private final Stack<Command> redoStack;

    public ControllerHome() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }
    public void setCommand(Command command){
        this.command = command;
    }

    public void pressBtnRunCmd(){
        if(command != null){
            command.runCmd();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        } else {
            System.out.println("Please set the command");
        }
    }

    public void pressBtnUndoCmd(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo - undo stack is empty!");
        } else {
            command = undoStack.pop();
            command.undoCmd();
            redoStack.push(command);
            listRedoStack();
            listUndoStack();
        }
    }

    public void pressBtnRedoCmd(){
        if (redoStack.isEmpty()){
            System.out.println("Nothing to redo - redo stack is empty!");
        } else {
            command = redoStack.pop();
            command.runCmd();
            undoStack.push(command);
            listUndoStack();
            listRedoStack();
        }
    }

    private void listUndoStack(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to undo - undo stack is empty!");
        } else {
            System.out.println("=================== Undo Stack content ===================");

            for(Command command : undoStack){
                System.out.println(command);
            }
        }
    }

    private void listRedoStack(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to undo - undo stack is empty!");
        } else {
            System.out.println("=================== Redo Stack content ===================");
            for(Command command : redoStack){
                System.out.println(command);
            }
        }
    }

    public void resetBtnController(){
        command = null;
        undoStack.clear();
        redoStack.clear();
        System.out.println("Controller has been reset - Set new command!");
    }
}
