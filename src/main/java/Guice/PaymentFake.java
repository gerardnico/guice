package Guice;

/**
 * The implements of a {@link Payment}
 */
public class PaymentFake implements Payment {


    public boolean processPayment() {
        System.out.println("FAKE: A FAKE payment was processed");
        return true;
    }

}
