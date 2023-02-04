package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategy.PaymentStrategy;

public class PaymentService {
    private int cost;
    private boolean includeDelivery = true;
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(int cost){
        this.cost = cost;
        paymentStrategy.collectPaymentDetails();
        if (paymentStrategy.validatePaymentDetails()){
            paymentStrategy.pay(getTotal());
        }
    }
    private int getTotal(){
        return includeDelivery ? cost + 10 : cost;
    }
}
