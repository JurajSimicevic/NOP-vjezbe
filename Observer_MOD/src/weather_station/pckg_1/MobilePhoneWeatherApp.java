package weather_station.pckg_1;

import ws_pokusaj.pckg1.WeatherStatObservable;

public class MobilePhoneWeatherApp implements Observer, Display{

    private double temp;
    private double press;
    private double hum;
    private WeatherStation weatherStation;

    public void setWeatherStation(WeatherStation weatherStation) {
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
