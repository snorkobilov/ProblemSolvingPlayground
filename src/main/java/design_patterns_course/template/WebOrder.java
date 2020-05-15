package design_patterns_course.template;

public class WebOrder extends OrderTemplate {
    @Override
    public void doCheckout() {
        System.out.println("Web order checking out");
    }

    @Override
    public void doPayment() {
        System.out.println("Web order making payment");
    }

    @Override
    public void doReceipt() {
        System.out.println("Web order receipt");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Web order delivery");
    }
}
