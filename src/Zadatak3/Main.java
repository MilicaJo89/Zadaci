package Zadatak3;

public class Main  {
    public static void main(String[] args) {

        Car car=new Car();
        Motorcycle bike = new Motorcycle();

        Vehicle[] soundables = {car,bike};

        for(Vehicle x: soundables){
            x.makeSound();
        }



    }
}
