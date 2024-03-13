package Zadatak2;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("Toyota","Cors",4,4);
        Bicycle bike = new Bicycle("Brampton","A Line",2,2);


        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.wheels);
        System.out.println(car.doors);
        System.out.println(bike.make);
        System.out.println(bike.model);
        System.out.println(bike.wheels);
        System.out.println(bike.pedals);

        /*car.Ride();
          bike.Ride();*/

    }

}
