package Zadatak3;

public class Motorcycle extends Vehicle implements Soundable{
    @Override
    public void makeSound() {
        System.out.println("Bike makes a sound");
    }
}
