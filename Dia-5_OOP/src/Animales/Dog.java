package Animales;

public class Dog extends Animal{
    String lastName;

    public static void main(String[] args){
        Dog dog = new Dog("pepe","vibora","pepito");
        dog.makeSound();

        System.out.println(dog);
    }

    public Dog() {

    }

    public Dog(String name, String type, String lastName) {
        super(name,type);
        this.lastName = lastName;
    }

    @Override
    public void makeSound(){
        System.out.println("bark");
    }

    @Override
    public String toString() {
        return "El perro se llama "+ this.getName();
    }
}
