package com.otaviojava.workshop.microstream.helidon;

import com.otaviojava.workshop.microstream.helidon.vehicle.Car;
import com.otaviojava.workshop.microstream.helidon.vehicle.Vehicle;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class App1 {

    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            Vehicle vehicle = container.select(Vehicle.class).get();
            vehicle.move();

            Car car = container.select(Car.class).get();
            car.move();

            System.out.println("Is the same vehicle? " + car.equals(vehicle));
        }
    }
}
