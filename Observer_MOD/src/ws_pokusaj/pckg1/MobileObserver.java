package ws_pokusaj.pckg1;

import weather_station.pckg_1.Observer;
import weather_station.pckg_1.WeatherStation;

public class MobileObserver implements Display, Observer {

    private double temp;
    private double press;
    private double hum;
    private WeatherStatObservable weatherStation;

    public MobileObserver() {}

    public void setObservable(WeatherStatObservable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        System.out.println("Displaying:");
        System.out.println(temp + "°C");
        System.out.println(press + "hPa");
        System.out.println(hum + "%");
    }

    @Override
    public void update() {
        this.press = weatherStation.getPressure();
        this.hum = weatherStation.getHumidity();
        this.temp = weatherStation.getTemperature();
        System.out.println("All is updated!");
        System.out.println(Integer.toHexString(this.hashCode()) + "@" + getClass().getSimpleName());
        display();
    }
}
