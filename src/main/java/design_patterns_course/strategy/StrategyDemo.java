package design_patterns_course.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        var amexCard = new CreditCard(new AmexStrategy());
        amexCard.setNumber("1234");
        amexCard.setDate("234234");
        amexCard.setCvv("234");

        System.out.println("Is Amex valid: " + amexCard.isValid());

        var visaCard = new CreditCard(new VisaStrategy());
        System.out.printf("Is Visa valid: %s, : %s", VisaStrategy.class.getSimpleName(), visaCard.isValid());
    }
}
