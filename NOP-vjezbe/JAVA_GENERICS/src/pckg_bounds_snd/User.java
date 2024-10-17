package pckg_bounds_snd;

public class User implements Comparable<User>{

    private int id;
    private static int cntID = 10;

    private String name;

    public User(String name){
        this.name = name;
        this.id = cntID++;
    }

    public int getId(){
        return this.id;
    }

//    @Override
//    public int compareTo(User other) {
//        int res;
//        if (this.id > other.id) {
//            System.out.println("First users ID is larger than the second user");
//            res = 1;
//        }else if (this.id < other.id) {
//            System.out.println("First user ID is smaller than the second user");
//            res = -1;
//        } else {
//            System.out.println("Both users IDs are equal");
//            res = 0;
//        }
//        return res;
//    }

    public int getNameLength(){
        return this.name.length();
    }


    @Override
    public int compareTo(User other) {
        if (this.getNameLength() > other.getNameLength()){
            return 1;
        } else if (this.getNameLength() < other.getNameLength()){
            return -1;
        } else {
            return 0;
        }
    }
}
