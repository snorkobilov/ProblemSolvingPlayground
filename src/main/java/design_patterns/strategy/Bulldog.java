package design_patterns.strategy;

public class Bulldog extends Dog {

    public Bulldog() {
        eatBehavior = new MeatEater();
        barkBehavior = new LoudBarker();
    }
}
