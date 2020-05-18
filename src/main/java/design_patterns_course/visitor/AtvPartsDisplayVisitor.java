package design_patterns_course.visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {
    @Override
    public void visit(Oil part) {
        System.out.println("Displaying OIL");
    }

    @Override
    public void visit(Fender part) {
        System.out.println("Displaying FENDER");
    }

    @Override
    public void visit(Wheel part) {
        System.out.println("Displaying WHEEL");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("We have an order");
    }
}
