package ua.hillel.homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckTriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть сторони трикутника: ");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == b && b == c) {
                System.out.println("Рівносторонній трикутник.");
            } else if (((a*a)+(b*b))==(c*c) || ((a*a)+(c*c))==(b*b) || ((c*c)+(b*b))==(a*a)) {
                System.out.println("Прямокутний трикутник");
            } else if (a!=b && b!=c && c!=a) {
                System.out.println("Прямокутний трикутник");
            } else if (a==b || c==a || c==b) {
                System.out.println("Рівнобедрений трикутник");
            }
        } catch (InputMismatchException e) {
            System.out.println("Було введено невірне назчення. Спробуй ще.");
        }
    }
}
