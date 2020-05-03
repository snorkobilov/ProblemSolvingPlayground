package design_patterns.course;

import design_patterns.course.interfaces.Predicate;

import java.util.function.UnaryOperator;

public class PlayWithPredicates {

    public static void main(String[] args) {
        Predicate<String> p1 = s -> s != null;
        Predicate<String> p2 = s -> !s.isEmpty();

        Predicate<String> p3 = p1.and(p2);

        UnaryOperator<Integer> unaryOperator = s -> s.compareTo(1);

        System.out.println(p3.test("sl"));
    }
}
