package design_patterns.strategy;

public class MeatEater implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("eating Meat...");
    }
}
