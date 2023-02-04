package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategy.PaymentByCreditCard;
import patterns.behavioral.strategy.strategy.PaymentByVisa;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder(990);
        System.out.println();

        System.out.println("======================================");

        paymentService.setPaymentStrategy(new PaymentByVisa());
        paymentService.processOrder(2000);
    }
}
