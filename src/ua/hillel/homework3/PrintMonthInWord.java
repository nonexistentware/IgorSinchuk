package ua.hillel.homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintMonthInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення від 1 - 12 для виведення місяця.");
        try {
        int month = scanner.nextInt();
            switch (month) {
                case 1:
                    System.out.println("Січень");
                    break;
                case 2:
                    System.out.println("Лютий");
                    break;
                case 3:
                    System.out.println("Березень");
                    break;
                case 4:
                    System.out.println("Квітень");
                    break;
                case 5:
                    System.out.println("Травень");
                    break;
                case 6:
                    System.out.println("Червень");
                    break;
                case 7:
                    System.out.println("Липень");
                    break;
                case 8:
                    System.out.println("Серпень");
                    break;
                case 9:
                    System.out.println("Вересень");
                    break;
                case 10:
                    System.out.println("Жовтень");
                    break;
                case 11:
                    System.out.println("Листопад");
                    break;
                case 12:
                    System.out.println("Грудень");
                    break;
                default:
                    System.out.println(month + " Такого місяця не існує. Усього є тільки 12.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Було введено невірне назчення. Спробуй ще.");
        }
    }
}
