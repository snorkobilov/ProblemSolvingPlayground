package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImplementation implements Subject {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void updateObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void register() {
        observers.add(new BmwObserver());
    }

    @Override
    public void unregister() {

    }
}
