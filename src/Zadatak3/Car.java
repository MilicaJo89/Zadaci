package Zadatak3;

public class Car extends Vehicle implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("Car makes a sound");
    }
}
