package design_patterns.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new SubjectImplementation();
        subject.register();
        subject.updateObservers();
    }
}
