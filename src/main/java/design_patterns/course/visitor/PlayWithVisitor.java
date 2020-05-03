package design_patterns.course.visitor;

import design_patterns.course.visitor.model.Body;
import design_patterns.course.visitor.model.Car;
import design_patterns.course.visitor.model.Engine;

import java.util.function.Consumer;

public class PlayWithVisitor {
    public static void main(String[] args) {
        var car = new Car();
        var engine = new Engine();
        var body = new Body();

        Consumer<VisitorBuilder<String>> consumer =
                Visitor.<Car, String>forType(Car.class).execute((Car c) -> "Visiting car: " + c)
                        .forType(Engine.class).execute(e -> "Visiting engine: " + e)
                        .forType(Body.class).execute(b -> "Visiting body: " + b);

        Visitor<String> visitor = Visitor.of(consumer);

        String visitedCar = visitor.visit(car);
        System.out.println(visitedCar);

        String visitedEngine = visitor.visit(engine);
        System.out.println(visitedEngine);

        String visitedBody = visitor.visit(body);
        System.out.println(visitedBody);

//        visitor.visit(engine);
//        visitor.visit(body);
    }
}
