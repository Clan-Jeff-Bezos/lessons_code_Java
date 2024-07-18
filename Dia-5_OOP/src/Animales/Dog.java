package Animales;

public class Dog extends Animal{
    String lastName;

    public Dog(String name, String type, String lastName) {
        super(name,type);
        this.lastName = lastName;
    }

    public void makeSound(){
        System.out.println("bark");
    }
}
