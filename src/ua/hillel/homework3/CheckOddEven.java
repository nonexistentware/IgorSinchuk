package ua.hillel.homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        try {
        int number = scanner.nextInt();
        if ((number % 2) == 0) {
            System.out.println("Число " + number + " парне.");
        } else {
            System.out.println("Число " + number + " непарне.");
        }

        } catch (InputMismatchException e) {
            System.out.println("Було введено невірне назчення. Спробуй ще.");
        }
        System.out.println("BYE!");
    }
}
