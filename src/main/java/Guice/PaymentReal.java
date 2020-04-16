package Guice;

/**
 * The implements of a {@link Payment}
 */
public class PaymentReal implements Payment {


    public boolean processPayment() {
        System.out.println("REAL: A REAL payment was processed");
        return true;
    }

}
