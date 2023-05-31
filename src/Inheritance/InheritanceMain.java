package Inheritance;

import java.util.List;

public class InheritanceMain {
    public static void main(String[] args) {
        Engine truckEngine = new Engine(6, EngineType.DIESEL, 900);
        Truck truck = new Truck("Volvo", "MAN", truckEngine, 500, 1500, 9000);
        System.out.println("\n");
        Auto electricCar = new ElectricCar("Toyota", "Prius", 15000, 4);
        System.out.println("\n");
        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);
        Auto bus = new Bus("Mersedes", "Sprinter", busEngine, 150, 250, 12);
        Bus bus2 = new Bus("Mersedes", "Sprinter", busEngine, 150, 250, 12);
        //   Auto auto = new Auto("WV", "Golf", busEngine);

        runCar(bus);
        runCar(truck);
        runCar(electricCar);
        // runCar(auto);
    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        auto.energize();

    }
}
