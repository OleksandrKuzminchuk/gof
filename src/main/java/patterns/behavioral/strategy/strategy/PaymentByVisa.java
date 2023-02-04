package patterns.behavioral.strategy.strategy;

public class PaymentByVisa implements PaymentStrategy {
    private String email;
    private String password;
    @Override
    public void collectPaymentDetails() {
        email = "Visa Mail";
        password = "Visa Password";
        System.out.println("Collecting Visa Account Details...");

    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.printf("Validating Visa Info: %s | %s%n", email, password);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Visa");
    }
}
