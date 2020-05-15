package design_patterns_course.template;

public class StoreOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Store order checking out");
    }

    @Override
    public void doPayment() {
        System.out.println("Store order making payment");
    }

    @Override
    public void doReceipt() {
        System.out.println("Store order receipt");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Store order delivery");
    }
}
