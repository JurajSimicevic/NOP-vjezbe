package pckg_bounds;

public class User extends Person{

    private int id;
    private static int cntID = 10;

    protected User(String name) {
        super(name);
        this.id = cntID++;
    }

    public void performSomething() {
        System.out.println(getClass().getSimpleName() + "performing something simple.");
    }

    @Override
    public void someMethod(String content) {
        System.out.println(content);
    }
}
