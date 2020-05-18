package design_patterns_course.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        PartsOrder partsOrder = new PartsOrder();
        partsOrder.addPart(new Wheel());
        partsOrder.addPart(new Fender());
        partsOrder.addPart(new Oil());

        partsOrder.accept(new AtvPartsShippingVisitor());
        partsOrder.accept(new AtvPartsDisplayVisitor());
    }
}
