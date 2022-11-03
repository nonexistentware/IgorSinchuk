package ua.hillel.homework2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введить першу сторону прямокутника: ");
            double a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Введіть другу сторону прямокутника: ");
            double b = scanner.nextDouble();
            double result = a * b;
            System.out.println("Площа прямокутніка дорівнює: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Було введеон неправильне значення.Сбробуйте ще.");
        }
    }
}
