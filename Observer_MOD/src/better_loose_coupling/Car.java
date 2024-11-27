package better_loose_coupling;

public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void driveCar(){
        engine.start();
        System.out.println("Driving a car with: " + engine.getClass().getSimpleName());
        engine.stop();
    }

}
