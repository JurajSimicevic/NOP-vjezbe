package pckg_macro;

import java.util.ArrayList;

public class MacroTest {

    public static void main(String[] args) {
        GarageDoorToggle gdt = new GarageDoorToggle();
        GarageLightToggle glt = new GarageLightToggle();
        ArrayList<Command> commands = new ArrayList<Command>();
        commands.add(gdt);
        commands.add(glt);
        MacroCmdFST macro = new MacroCmdFST(commands);
        macro.run();
        macro.undo();
        macro.run();
    }
}
