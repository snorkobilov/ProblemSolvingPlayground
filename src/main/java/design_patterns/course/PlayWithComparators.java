package design_patterns.course;

import design_patterns.course.interfaces.Comparator;
import design_patterns.course.interfaces.Function;
import design_patterns.course.models.Person;

public class PlayWithComparators {

    public static void main(String[] args) {
        var mary = new Person("Mary", 28);
        var john = new Person("John", 22);
        var linda = new Person("Linda", 26);
        var james = new Person("James", 32);

        Function<Person, String> getName = person -> person.getName();
        Function<Person, Integer> getAge = person -> person.getAge();

        Comparator<Person> cmpName = Comparator.comparing(getName);
        Comparator<Person> cmpAge = Comparator.comparing(getAge);

        System.out.println("Mary > John : " + (cmpName.compare(mary, john) > 0));
        System.out.println("Mary > John : " + (cmpAge.compare(mary, john) > 0));

    }

}
