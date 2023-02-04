package patterns.behavioral.strategy.strategy;

import patterns.behavioral.strategy.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard card;
    @Override
    public void collectPaymentDetails() {
     card = new CreditCard("cardNumber", "expiryDate", "cvv");
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Card Info: " + card);
        return true;
    }

    @Override
    public void pay(int amount) {
        if (amount <= card.getAmount()){
            System.out.println("Paying " + amount + " using Credit Card");
            card.setAmount(card.getAmount() - amount);
        }else {
            throw new RuntimeException("Not enough money to paying!!!");
        }

    }
}
