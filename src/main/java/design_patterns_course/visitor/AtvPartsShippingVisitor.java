package design_patterns_course.visitor;

import java.util.List;

public class AtvPartsShippingVisitor implements AtvPartVisitor {
    double shippingAmount = 0;

    @Override
    public void visit(Oil part) {
        shippingAmount += 9;
        System.out.println("Shipping oil");
    }

    @Override
    public void visit(Fender part) {
        shippingAmount += 5;
        System.out.println("Shipping Fender");
    }

    @Override
    public void visit(Wheel part) {

        shippingAmount += 15;
        System.out.println("Wheels are expensive to ship");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("If customer buys more than 3 items, discounts are applied");
        List<AtvPart> parts = partsOrder.getParts();
        if(parts.size()>3){
            shippingAmount -=5;
        }

        System.out.println("Shipping amount is "+shippingAmount);
    }
}
