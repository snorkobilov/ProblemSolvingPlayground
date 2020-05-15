package design_patterns_course.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
    private static void printContents(List<Person> people) {
        people.forEach(person -> System.out.println(person.getName()));
    }

    public static void main(String[] args) {
        var brian = new Person("Brian", "801-555-1212", 38);
        var mark = new Person("Mark", "801-555-1234", 41);
        var chris = new Person("Chris", "801-555-1252", 38);

        var people = new ArrayList<Person>();
        people.add(brian);
        people.add(mark);
        people.add(chris);

        System.out.println("NotSorted");
        printContents(people);

        people.sort(Comparator.comparing(Person::getAge)
                .thenComparing(Person::getName)
                .thenComparing(Person::getPhoneNumber));

        System.out.println("\nSorted by age");
        printContents(people);
    }
}
