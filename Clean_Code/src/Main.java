import classes.Car;
import classes.Vehicles;
import enums.Model;

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("goa","asd");
        System.out.println(vehicles.toString());
        vehicles.honk();

        Vehicles.status();
        Car car = new Car();

        car.setName("cambiado");

        System.out.println(vehicles.getName());
        System.out.println(car.getName());

        Model model = Model.M2009;
        Model model2 = Model.valueOf("M2008");
    }
}