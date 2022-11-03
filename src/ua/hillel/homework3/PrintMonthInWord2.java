package ua.hillel.homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintMonthInWord2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення від 1 - 12 для виведення місяця.");
        try {
            int month = scanner.nextInt();
            if (month == 1) {
                System.out.println("Січень");
            } else if (month == 2) {
                System.out.println("Лютий");
            } else if (month == 3) {
                System.out.println("Березень");
            } else if (month == 4) {
                System.out.println("Квітень");
            } else if (month == 5) {
                System.out.println("Травень");
            } else if (month == 6) {
                System.out.println("Червень");
            } else if (month == 7) {
                System.out.println("Липень");
            } else if (month == 8) {
                System.out.println("Серпень");
            } else if (month == 9) {
                System.out.println("Вересень");
            } else if (month == 10) {
                System.out.println("Жовтень");
            } else if (month == 11) {
                System.out.println("Листопад");
            } else if (month == 12) {
                System.out.println("Грудень");
            } else if (month > 12) {
                System.out.println("Більше ніж 12 місяців не існує.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Було введено невірне назчення. Спробуй ще.");
        }
    }
}
