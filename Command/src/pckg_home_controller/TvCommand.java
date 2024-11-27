package pckg_home_controller;

public class TvCommand implements Command {

    private final TV tv;


    public TvCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void runCmd() {
        tv.turnOn();
    }

    @Override
    public void undoCmd() {
        tv.turnOff();
    }
}
