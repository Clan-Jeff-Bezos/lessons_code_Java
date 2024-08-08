package classes;

import java.util.ArrayList;
import java.util.List;

public class Management {
    // Form 1
    private Vehicles[] vehicles = new Vehicles[10];

    // Form 2
    private ArrayList<Vehicles> vehicles2 = new ArrayList<>();

    // Form 3
    private List<Vehicles> vehicles3 = new ArrayList<>();

    public void addList(Vehicles vehicle, int index){
        this.vehicles[index] = vehicle;
    }

    public void addList2(Vehicles vehicle){
        this.vehicles2.add(vehicle);
    }

    public void addList3(Vehicles vehicle){
        this.vehicles3.add(vehicle);
    }

    public void showList(){
        for(Vehicles vehicle: vehicles){
            System.out.println(vehicle);
        }
    }

    public void showList2() {
        for (Vehicles vehicle : vehicles2) {
            System.out.println(vehicle);
        }
    }

    public void showList3() {
        for (Vehicles vehicle : vehicles3) {
            System.out.println(vehicle);
        }
    }

    public static void main(String[] args){

        Management management = new Management();

        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        management.addList(car, 0);
        management.addList2(motorcycle);
        management.addList3(car);

        management.showList(); // Array que siempre todos los espacios
        management.showList2();
        management.showList3();
    }
}
