package Guice;

import com.google.inject.Inject;

/**
 * A service that executes a {@link Delivery}
 */
public class DeliveryService {


    private final Delivery delivery;

    @Inject
    public DeliveryService(Delivery delivery) {
        this.delivery = delivery;
    }


    public void deliver(String item) {
        this.delivery.deliver(item);
    }
}
