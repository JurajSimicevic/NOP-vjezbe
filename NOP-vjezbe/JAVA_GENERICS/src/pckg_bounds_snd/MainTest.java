package pckg_bounds_snd;

public class MainTest {

    public static void main(String[] args) {
        String fst = "Some simple string";
        String snd = "This one is the second one and it is slightly different...";

        CompareTWO<String> compareStrings = new CompareTWO<>(fst, snd);
        compareStrings.compareTwo();

        Integer fstint = 120;
        Integer sndint = 45;

        CompareTWO<Integer> integerCompareTWO = new CompareTWO<>(fstint, sndint);
        integerCompareTWO.compareTwo();

        User us1 = new User("Jureksdfsdfsdf");
        User us2 = new User("Burek");

        CompareTWO<User> userCompareTWO = new CompareTWO<User>(us1, us2);
        userCompareTWO.compareTwo();
    }
}
