package weather_station.pckg_1;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableWS{

    private double humidity;
    private double pressure;
    private double temperature;
    private final List<Observer> observers;


    public WeatherStation(double humidity, double pressure, double temperature) {
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

    public void setStateWeatherData(double p, double t, double h){
        this.humidity = h;
        this.pressure = p;
        this.temperature = t;
        System.out.println("Weather data changed successfully!");
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
