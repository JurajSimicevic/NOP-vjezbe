package ws_pokusaj.pckg1;

import weather_station.pckg_1.Observer;

public interface ObservableInt {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
}
