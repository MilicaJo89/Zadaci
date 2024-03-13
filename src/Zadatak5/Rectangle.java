package Zadatak5;

public class Rectangle extends Shape{
    @Override
    void calculateArea() {
        System.out.println("This is the calculated area of the rectangle");
    }

    @Override
    void calculatePerimeter() {
        System.out.println("This is calculated perimeter of the rectangle");
    }
}
