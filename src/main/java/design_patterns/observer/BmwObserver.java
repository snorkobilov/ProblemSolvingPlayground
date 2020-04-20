package design_patterns.observer;

public class BmwObserver implements Observer {
    @Override
    public void update() {
        System.out.println("BMW updated");
    }
}
