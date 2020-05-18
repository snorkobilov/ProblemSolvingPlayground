package design_patterns_course.mediator;

import design_patterns_course.command.Command;
import design_patterns_course.command.Light;

public class MediatorDemo {
    public static void main(String[] args) {
        var mediator = new Mediator();

        var bedroomLight = new Light("Bedroom");
        var kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();
    }
}
