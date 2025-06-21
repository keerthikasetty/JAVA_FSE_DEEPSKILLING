package FSE_WEEK1_DESIGN_PATTERNS.adapterpattern;

interface PaymentProcessor {
    void processPayment(double amount);
}

class PayPal {
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal = new PayPal();

    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.processPayment(1500);
    }
}
