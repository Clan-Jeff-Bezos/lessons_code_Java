package classes;

import interfaces.VehiclesActions;

public class Car extends Vehicles implements VehiclesActions {
    private Integer windows;

    // Constructor
    public Car() {
    }

    public Car(String model, String brand, Integer windows) {
        super(model, brand);
        this.windows = windows;
    }

    // Methods
    @Override
    public void move(){
        System.out.println("I'm moving with four wheels");
    }

    @Override
    public void playMusic(String song) {
        System.out.printf("Playing now (%s)",song);
    }

    // Getter
    public Integer getWindows() {
        return this.windows;
    }

    // Setter
    public void setWindows(Integer windows) {
        this.windows = windows;
    }

    // toString
    @Override
    public String toString() {
        return "Car: " +
                "Model: " + getModel() +
                "Brand: " + getBrand() +
                "Windows: " + this.windows;
    }
}
