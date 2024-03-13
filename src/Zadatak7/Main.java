package Zadatak7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number");
            scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }
        finally {
            scanner.close();
        }
    }
}
