package practice.behaviouraldesignpattern.observer.impl.observer;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import practice.behaviouraldesignpattern.observer.Observer;

@EqualsAndHashCode
@RequiredArgsConstructor
public class Phone implements Observer {

    private final String name;

    @Override
    public void update(String message) {
        System.out.println(name+ " temp is "+message);
    }
}
