package practice.behaviouraldesignpattern.observer.impl.subject;

import lombok.Getter;
import lombok.Setter;
import practice.behaviouraldesignpattern.observer.Observer;
import practice.behaviouraldesignpattern.observer.Subject;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class WeatherStation implements Subject {

    private String temp = "";

    List<Observer> list = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        list.forEach(observer -> observer.update(temp));
    }
}
