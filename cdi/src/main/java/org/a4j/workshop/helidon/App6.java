package org.a4j.workshop.helidon;

import org.a4j.workshop.helidon.auditaded.FastSupplier;
import org.a4j.workshop.helidon.auditaded.SlowSupplier;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import java.util.function.Supplier;

public class App6 {

    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Supplier<String> fastSupplier = container.select(FastSupplier.class).get();
            Supplier<String> slowSupplier = container.select(SlowSupplier.class).get();
            System.out.println("The result: " + fastSupplier.get());
            System.out.println("The result: " + slowSupplier.get());
        }
    }
}
