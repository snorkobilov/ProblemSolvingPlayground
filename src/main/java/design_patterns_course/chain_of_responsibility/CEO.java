package design_patterns_course.chain_of_responsibility;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything they want");
    }
}
