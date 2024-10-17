package pckg_ducks;

public class NoFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("Cannot fly at all!");
    }
}
