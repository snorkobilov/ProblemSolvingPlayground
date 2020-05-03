package design_patterns.course;

import design_patterns.course.interfaces.Factory;
import design_patterns.course.models.Circle;

public class PlayWithFactory {

    public static void main(String[] args) {

        Factory<Circle> factoryCircle = Factory.createFactory(Circle::new);
        Circle circle = factoryCircle.newInstance();
        Circle circle2 = factoryCircle.newInstance();

        System.out.println(circle.hashCode());
        System.out.println(circle2.hashCode());
    }
}
