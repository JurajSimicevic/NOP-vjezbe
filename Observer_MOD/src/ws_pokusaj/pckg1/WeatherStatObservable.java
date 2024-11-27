package ws_pokusaj.pckg1;

import weather_station.pckg_1.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStatObservable implements ObservableInt {

    private float humidity;
    private float pressure;
    private float temperature;
    private final List<Observer> observers;


    public WeatherStatObservable(float humidity, float pressure, float temperature) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        if(observers.contains(observer)){
            System.out.println("Observer already added");
        } else {
            observers.add(observer);
            System.out.println( observer + " added successfully!");
        }
    }

    @Override
    public void remove(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
            System.out.println( observer + " removed successfully!");
        } else {
            System.out.println("Can't remove - observer not in the list!");
        }
    }

    @Override
    public void notifyAllObservers() {
        if (observers.isEmpty()){
            System.out.println("Observers list is empty!");
        } else {
            for(Observer observer : observers){
                observer.update();
            }
        }

    }

    public void setStateData(float humidity, float pressure, float temperature){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        System.out.println("Weather data changed successfully!");
        stateChanged();
    }

    private void stateChanged() {
        notifyAllObservers();
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }
}
