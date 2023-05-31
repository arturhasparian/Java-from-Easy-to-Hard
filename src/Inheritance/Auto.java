package Inheritance;

public abstract class Auto {
    private String product;
    private String model;
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String product, String model, Engine engineType) {
        this.product = product;
        this.model = model;
        this.engine = engineType;
        //System.out.println("Auto initialized");
    }

    public abstract void energize();

    public static void doSmth() {
    }

    ;

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto has stopped");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println("Accelerating. Current speed is " + currentSpeed + "kmPerHour");
    }

    public String getProduct() {
        return product;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "product='" + product + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engine +
                ", currentSpeed=" + currentSpeed +
                ", isRunning=" + isRunning +
                '}';
    }
}
