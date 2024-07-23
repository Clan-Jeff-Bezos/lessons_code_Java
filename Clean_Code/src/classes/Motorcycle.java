package classes;

import interfaces.VehiclesActions;

public class Motorcycle extends Vehicles implements VehiclesActions {
    private Boolean chain;

    // Constructor
    public Motorcycle(){}

    public Motorcycle(String model, String brand,Boolean chain){
        super(model,brand);
        this.chain = chain;
    }

    // Methods
    @Override
    public void move(){
        System.out.println("I'm moving with two wheels");
    }

    @Override
    public void playMusic(String song) {

    }

    // Getter
    public Boolean getChain() {
        return this.chain;
    }

    // Setter
    public void setChain(Boolean chain) {
        this.chain = chain;
    }

    // toString
    @Override
    public String toString() {
        return "Motorcycle: " +
                "Model: " + getModel() +
                "Brand: " + getBrand() +
                "Chain: " + this.chain;
    }


}
