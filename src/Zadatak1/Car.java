package Zadatak1;

public class Car {

    String make;
    String model;
    int year;


    Car(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public String toString(){
        return make+'\n'+model+'\n'+year;
    }
}
