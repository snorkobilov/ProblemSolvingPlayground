package design_patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class PlayWithStrategy {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Bulldog());
        dogs.add(new DeafDog());

        dogs.forEach(dog -> {
            dog.eat();
            dog.bark();
        });

    }
}
