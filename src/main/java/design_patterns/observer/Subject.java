package design_patterns.observer;

public interface Subject {
    void updateObservers();
    void register();
    void unregister();
}
