package Animales;

public class Animal {
    private String type;
    private String name;


    // Contructor vacio
    public Animal() {
    }

    // Contructor con todos los atributos
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Constructor donde solo se el nombre
    public Animal(String name) {
        this.name = name;
    }

    public void editAll(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void makeSound(){
        System.out.println("The "+name+" makes a sound");
    }

    public void makeSound(String name, String name2){
        System.out.println("The "+name+" makes a sound");
    }
}
