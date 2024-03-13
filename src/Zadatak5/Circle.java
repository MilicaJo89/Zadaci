package Zadatak5;

public class Circle extends Shape {
    @Override
    void calculateArea() {
        System.out.println("This is a calculated area of the circle");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("This is the perimeter of the circle");
    }
}
