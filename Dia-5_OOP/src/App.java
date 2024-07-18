import Animales.Animal;
import Animales.Cat;
import ejemploTaller.Punto;

import java.util.Scanner;

public class App {
    // Por convencion las clases empiezan con 
    // mayuscula
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Pizza pizzaJamon = new Pizza(); // atributos que pertecen a su espacio (scope)
        Pizza pizzaPiña = new Pizza();
        pizzaJamon.estado = "crud";

        Scanner scanner = new Scanner(System.in);

        pizzaJamon.hornear();
        Integer numero = null;
        // int numerodos = null;

        Punto punto = new Punto();
        punto.cuadrante();


        PuntoDos puntoDos = new PuntoDos();
        puntoDos.cuadrante();
        puntoDos.cuadrantes();


        Cat cat = new Cat();
        Animal animalEmpty = new Animal();
        Animal animal = new Animal("Pepe","Vibora");

        // Class abstract
        // Interface
        // Enums
    }



}