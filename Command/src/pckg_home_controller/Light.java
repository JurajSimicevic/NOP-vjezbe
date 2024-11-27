package pckg_home_controller;

public class Light {

    public void lightOn(){
        System.out.println(getClass().getSimpleName() + " is turned on");
    }

    public void lightOff(){
        System.out.println(getClass().getSimpleName() + " is turned off");
    }
}
