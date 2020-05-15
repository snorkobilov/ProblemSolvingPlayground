package design_patterns_course.command;

public class CommandDemo {
    public static void main(String[] args) {
        var light = new Light();
        var lightSwitch = new Switch();

        Command command = new ToggleCommand(light);

        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
    }
}
