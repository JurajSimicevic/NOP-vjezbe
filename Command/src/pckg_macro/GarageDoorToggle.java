package pckg_macro;

public class GarageDoorToggle implements Command{
    @Override
    public void run() {
        System.out.println("Openning garage doors!");
    }

    @Override
    public void undo() {
        System.out.println("Closing garage doors!");
    }
}
