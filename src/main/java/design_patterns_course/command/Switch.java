package design_patterns_course.command;

/**
 * Sender, Invoker
 */
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
