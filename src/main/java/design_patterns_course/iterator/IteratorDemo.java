package design_patterns_course.iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        var repository = new BikeRepository();

        repository.addBike("Cervelo");
        repository.addBike("Scott");
        repository.addBike("Fuji");

        Iterator<String> bikeIterator = repository.iterator();
        while (bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
        }
    }
}
