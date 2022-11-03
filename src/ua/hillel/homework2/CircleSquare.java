package ua.hillel.homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введіть радіус кола: ");
            double radius = scanner.nextDouble();
            double result = Math.pow(radius, 2);
            System.out.println("Площа кола дорінює з радіусом " + radius + ": " + result);
        } catch (InputMismatchException e) {
            System.out.println("Було введеон неправильне значення.Сбробуйте ще.");
        }
    }
}
