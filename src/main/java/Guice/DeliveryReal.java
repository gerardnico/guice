package Guice;

/**
 * The implements of a {@link Delivery}
 */
public class DeliveryReal implements Delivery {


    public void deliver(String item) {

        System.out.println("REAL: The item " + item + " was delivered by our REAL system");

    }

}
