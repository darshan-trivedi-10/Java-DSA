import java.util.Scanner;

class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
//        super(); // Calls the constructor of the superclass (Animal)
        System.out.println("Dog constructor called");
    }

    @Override
    void sound() {
        super.sound(); // Calls the sound() method of the superclass (Animal)
        System.out.println("Dog barks");
    }

    void printNames() {
        System.out.println("Name in Dog: " + name); // Refers to the name in Dog class
        System.out.println("Name in Animal: " + super.name); // Refers to the name in Animal class
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method in Dog class
        dog.printNames(); // Demonstrates the use of super to access fields
    }
}
