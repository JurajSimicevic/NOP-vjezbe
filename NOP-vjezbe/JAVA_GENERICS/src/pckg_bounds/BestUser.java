package pckg_bounds;

public class BestUser extends User {

    protected BestUser(String name) {
        super(name);
    }

    @Override
    public void performSomething() {
        super.performSomething();  // pokrenut ce se metoda iz klase User
        System.out.println("This one can perform something additional in the best way - " + getClass().getSimpleName());
    }
}
