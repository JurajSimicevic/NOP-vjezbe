package pckg_bounds;

public class TestApp {

    public static void main(String[] args) {
        Integer [] ints = {1, 2, 3};  // ints - referenca na niz objekata tipa Integer
        BestUser[] users = {new BestUser("Besty"), new BestUser("Plain"), new BestUser("New User")};
        User[] users2 = {new BestUser("Besty"), new BestUser("Plain"), new NewUser("New User")};
        SimpleClass<BestUser> bestUserSimpleClass = new SimpleClass<BestUser>(users);
        bestUserSimpleClass.performSomething();
        SimpleClass<NewUser> newUserSimpleClass = new SimpleClass<>();
        SimpleClass<User> userSimpleClass = new SimpleClass<>(users2);
        System.out.println("-------------------------------------------------");
        userSimpleClass.performSomething();
    }
}
