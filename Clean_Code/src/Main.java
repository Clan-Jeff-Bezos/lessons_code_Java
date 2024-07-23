import classes.Vehicles;
import enums.Model;

public class Main {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles("goa","asd");
        System.out.println(vehicles.toString());
        vehicles.honk();

        Model model = Model.M2009;
        Model model2 = Model.valueOf("M2008");
    }
}