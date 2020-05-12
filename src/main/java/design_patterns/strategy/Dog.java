package design_patterns.strategy;

public abstract class Dog {
    BarkBehavior barkBehavior;
    EatBehavior eatBehavior;

    void bark() {
        barkBehavior.bark();
    }

    void eat() {
        eatBehavior.eat();
    }
}
