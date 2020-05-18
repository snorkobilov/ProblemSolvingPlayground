package design_patterns_course.mediator;

import design_patterns_course.command.Command;

public class TurnOnAllLightsCommand implements Command {
    private Mediator mediator;

    public TurnOnAllLightsCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
