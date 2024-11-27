package ws_pokusaj.pckg1;

import weather_station.pckg_1.MobilePhoneWeatherApp;
import weather_station.pckg_1.WeatherStation;

public class App {

    public static void main(String[] args) {
        WeatherStatObservable weatherStation = new WeatherStatObservable(78, 1015, 9);
        MobileObserver mo1 = new MobileObserver();
        MobileObserver mo2 = new MobileObserver();
        mo1.setObservable(weatherStation);
        mo2.setObservable(weatherStation);
        weatherStation.add(mo1);
        weatherStation.add(mo2);
        weatherStation.setStateData(1014,8, 77);
    }

}
