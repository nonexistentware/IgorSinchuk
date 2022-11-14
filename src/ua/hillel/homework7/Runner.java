package ua.hillel.homework7;



public class Runner extends AdvancedCalculator{
    public static void main(String[] args) {

        AdvancedCalculator advanced = new AdvancedCalculator();

        System.out.println(advanced.sum(21,9));
        System.out.println(advanced.subtract(4, 8));
        System.out.println(advanced.divide(12, 9));
        System.out.println(advanced.multiply(7, 8));
        System.out.println(advanced.sqrt(41));
        System.out.println(advanced.sin(5));
        System.out.println(advanced.cos(9));
        System.out.println(advanced.decToBin(11));
        System.out.println(advanced.decToHex(28));
    }
}
