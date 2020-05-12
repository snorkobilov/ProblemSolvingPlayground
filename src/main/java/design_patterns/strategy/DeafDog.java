package design_patterns.strategy;

public class DeafDog extends Dog {
    public DeafDog(){
        eatBehavior = new Vegetarian();
        barkBehavior = new SilentBarker();
    }
}
