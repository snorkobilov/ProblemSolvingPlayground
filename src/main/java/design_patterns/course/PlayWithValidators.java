package design_patterns.course;

import design_patterns.course.interfaces.Validator;
import design_patterns.course.models.Person;

public class PlayWithValidators {

    public static void main(String[] args) {
        var sarah = new Person("Sara", 29);
        var linda = new Person(null, 1_000);

        sarah = Validator.validate(n -> n.getName() != null, "Name should not be null")
                .on(sarah)
                .validate();
        System.out.println("Sarah: " + sarah);

        linda = Validator.validate(n -> n.getName() != null, "Name should not be null")
                .thenValidate(p -> p.getAge() > 0, "Age should be greater then zero")
                .thenValidate(p -> p.getAge() < 150, "Age should be less then 150")
                .on(linda)
                .validate();

        System.out.println(linda);

    }
}
