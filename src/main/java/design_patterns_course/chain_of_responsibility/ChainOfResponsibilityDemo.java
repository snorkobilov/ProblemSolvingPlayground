package design_patterns_course.chain_of_responsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        var bryan = new Director();
        var crystal = new VP();
        var jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        var request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}
