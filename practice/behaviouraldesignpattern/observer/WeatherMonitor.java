package practice.behaviouraldesignpattern.observer;

import practice.behaviouraldesignpattern.observer.impl.observer.Phone;
import practice.behaviouraldesignpattern.observer.impl.subject.WeatherStation;

public class WeatherMonitor {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(new Phone("Monica"));
        weatherStation.addObserver(new Phone("Vijay"));
        weatherStation.addObserver(new Phone("Vipul"));

        weatherStation.setTemp("27C");
        weatherStation.notifyObservers();

        weatherStation.removeObserver(new Phone("Vipul"));

        weatherStation.setTemp("29C");
        weatherStation.notifyObservers();

    }
}
