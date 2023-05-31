package Inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String product, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
        super(product, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePetrol());
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus has stopped");
    }

    public Bus(String product, String model, Engine engine, int availablePetrol, int tankVolume) {
        super(product, model, engine, availablePetrol, tankVolume);
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
        System.out.println("Adding DIESEL");

    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassenger(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + " passengers");
    }

    public void releasePassenger() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }
}
