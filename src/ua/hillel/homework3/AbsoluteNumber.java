package ua.hillel.homework3;



public class AbsoluteNumber {
    public static void main(String[] args) {
        int a = 3;
        int b = -9;
        if (Math.abs(a) == Math.abs(b)) {
            System.out.println("Абсолютне значення: " + a);
        } else {
            System.out.println("Абсолютне значення:" + b);
        }
    }
}
