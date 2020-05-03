package design_patterns.course;

import design_patterns.course.Registry.Builder;
import design_patterns.course.interfaces.Consumer;
import design_patterns.course.models.Rectangle;

public class PlayWithRegistry {

    public static void main(String[] args) {


        Consumer<Builder<Rectangle>> consumer = builder -> builder.register("rectangle", Rectangle::new);
    }
}
