package Guice;

import com.google.inject.AbstractModule;

/**
 *
 * A binder is a helping class to tell our dependency injection framework what to do in certain cases.
 * A module is a collection of bindings specified using fluent, English-like method calls
 *
 * For example, we need to specify that our main plugin class can not be instantiated again,
 * as it would crash our plugin like explained at the top. What we can do in this binder is bind the instance to the class object.
 */
public class ModuleFake extends AbstractModule {

    @Override
    protected void configure() {

        /**
         * Bind the {@link Payment} to {@link PaymentFake}
         * ie we will perform a fake payment
         */
        this.bind(Payment.class).to(PaymentFake.class);
        /**
         * Bind the {@link Delivery} to {@link DeliveryFakeFake}
         * ie we will perform a fake delivery
         */
        this.bind(Delivery.class).to(DeliveryFake.class);

    }

}
