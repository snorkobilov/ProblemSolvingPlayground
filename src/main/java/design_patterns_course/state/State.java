package design_patterns_course.state;

public abstract class State {
    public void handleRequest(){
        System.out.println("We should not get here.");
    }

}
