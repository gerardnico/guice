package Guice;

/**
 * The implements of a {@link Delivery}
 */
public class DeliveryFake implements Delivery {


    public void deliver(String item) {
        System.out.println("FAKE: The item "+item+" was delivered by our FAKE system");
    }
}
