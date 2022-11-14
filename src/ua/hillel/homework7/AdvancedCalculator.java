package ua.hillel.homework7;

public class AdvancedCalculator extends BasicCalculator{

    public double sqrt (double x) {
        return Math.sqrt(x);
    }

    public double cos (double x) {
        return (Math.cos(x));
    }

    public double sin (double x) {
        return (Math.sin(x));
    }

    public String decToBin (int x) {
        return Integer.toBinaryString(x);
    }

    public String decToHex (int x) {
        return Integer.toHexString(x);
    }
}
