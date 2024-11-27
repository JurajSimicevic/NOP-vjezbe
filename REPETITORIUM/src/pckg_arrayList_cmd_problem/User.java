package pckg_arrayList_cmd_problem;

public class User {

    private String userName;
    private int id;
    private static int cntID = 100;

    public User(String userName) {
        this.id = cntID++;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}
