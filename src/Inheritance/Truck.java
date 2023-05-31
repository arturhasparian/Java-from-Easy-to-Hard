package Inheritance;

public class Truck extends FuelAuto {

    private int cargoWeigt;

    public Truck(String product, String model, Engine engine, int availablePetrol, int tankVolume, int cargoWeigt) {
        super(product, model, engine, availablePetrol, tankVolume);
        this.cargoWeigt = cargoWeigt;
        System.out.println("Construction truck");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePetrol());
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Truck has stopped");
    }

    public int getCargoWeigt() {
        return cargoWeigt;
    }

    public void setCargoWeigt(int cargoWeigt) {
        this.cargoWeigt = cargoWeigt;
    }

    public void load() {
        System.out.println("Cargo load");
    }

    public void unload() {
        System.out.println("Cargo unload");
    }
}
