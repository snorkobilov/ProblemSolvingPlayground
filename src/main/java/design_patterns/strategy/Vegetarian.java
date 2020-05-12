package design_patterns.strategy;

public class Vegetarian implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("eating Vegetarian food");
    }
}
