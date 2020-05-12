package design_patterns.strategy;

public class LoudBarker implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Barking loud");
    }
}
