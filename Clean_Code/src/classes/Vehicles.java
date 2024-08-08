package classes;

public class Vehicles extends AbstractVehicles{
    // Attribute
    private String model;
    private String brand;
    private static String name = "hola";

    // Constructor
    // Empty
    public Vehicles(){}
    // All
    public Vehicles(String model, String brand){
        this.brand = brand;
        this.model = model;
    }

    // Methods
    public void move(){
        System.out.println("I'm class father");
    }

    // Method static
    public static void status(){
        System.out.println("Funciona");
    }

    // Getter
    public String getName(){
        return name;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    // Setter
    public void setName(String nameNew){
        name = nameNew;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    // toString -> Java
    @Override
    public String toString(){
        return "Model: "+ this.getModel()+ " and Brand: "+ this.getBrand();
    }
}
