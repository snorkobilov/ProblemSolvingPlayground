package design_patterns_course.template;

public abstract class OrderTemplate implements Order {

    public boolean isGift;

    public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    protected abstract void doDelivery();

    public final void wrapGift(){
        System.out.println("Gift was wrapped");
    }

    public final void processOrder(){
        doCheckout();
        doPayment();
        if(isGift){
            wrapGift();
        }
        doReceipt();
        doDelivery();
    }
}
