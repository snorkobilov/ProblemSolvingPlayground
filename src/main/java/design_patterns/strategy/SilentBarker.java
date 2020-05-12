package design_patterns.strategy;

public class SilentBarker implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("barking silently");
    }
}
