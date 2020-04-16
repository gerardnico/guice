package Guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

// // https://www.spigotmc.org/threads/tutorial-spigot-plugins-dependency-injection.295218/
public class Main {

    public static void main(String[] args) {

        /**
         * Module is fake
         * The injection will inject fake payment
         */
        System.out.println("###################################################");
        System.out.println("Fake module is running a fake process ");
        System.out.println("###################################################");
        Module module = new ModuleFake();
        Injector fakeInjector = Guice.createInjector(module);
        PaymentService paymentService = fakeInjector.getInstance(PaymentService.class);
        DeliveryService deliveryService = fakeInjector.getInstance(DeliveryService.class);
        processSales(paymentService,deliveryService);

        /**
         * Module is true
         * The injection will inject true payment
         */
        System.out.println("###################################################");
        System.out.println("Real module is running a real process ");
        System.out.println("###################################################");
        ModuleReal moduleReal = new ModuleReal();
        Injector realInjector = Guice.createInjector(moduleReal);
        paymentService = realInjector.getInstance(PaymentService.class);
        deliveryService = realInjector.getInstance(DeliveryService.class);
        processSales(paymentService,deliveryService);

    }

    private static void processSales(PaymentService paymentService, DeliveryService deliveryService) {
        deliveryService.deliver("shoe");
        paymentService.execute();
    }

}
