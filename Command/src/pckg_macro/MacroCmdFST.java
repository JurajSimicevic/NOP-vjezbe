package pckg_macro;

import java.util.ArrayList;
import java.util.Collections;

public class MacroCmdFST implements Command{

    private ArrayList<Command> commands;

    public MacroCmdFST(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void run() {
        if (commands.isEmpty()) {
            System.out.println("No commands to run");
        } else {
            for (Command command : commands) {
                command.run();
            }
        }
    }

    @Override
    public void undo() {
        Collections.reverse(commands);
        for (Command command : commands) {
            command.undo();
        }
        Collections.reverse(commands);
    }
}
