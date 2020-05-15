package design_patterns_course.template;

import java.util.ArrayList;
import java.util.List;

public class TemplateDemo {
    public static void main(String[] args) {
        var webOrder = new WebOrder();
//        webOrder.processOrder();

        var storeOrder = new StoreOrder();
//        storeOrder.processOrder();

        List<Order> orders = new ArrayList<>();
        orders.add(webOrder);
        orders.add(storeOrder);

        orders.forEach(Order::processOrder);
    }
}
