package Guice;

import com.google.inject.Inject;

/**
 * A service that executes a {@link Payment}
 */
public class PaymentService {


    private final Payment payment;

    @Inject
    public PaymentService(Payment payment) {
        this.payment = payment;
    }


    public void execute() {
        this.payment.processPayment();
    }
}
