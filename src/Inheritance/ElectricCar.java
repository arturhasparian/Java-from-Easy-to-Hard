package Inheritance;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passengerNumbers;

    public ElectricCar(String product, String model, int batteryVolume, int passengerNumbers) {
        super(product, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengerNumbers = passengerNumbers;
    }

    private void charge() {
        System.out.println("Battery is charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengerNumbers() {
        return passengerNumbers;
    }

    public void setPassengerNumbers(int passengerNumbers) {
        this.passengerNumbers = passengerNumbers;
    }

    @Override
    public void energize() {
        charge();
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Electric car is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Electric car has stopped");
    }
}
