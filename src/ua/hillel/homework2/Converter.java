package ua.hillel.homework2;


public class Converter {
    public static void main(String[] args) {
        int celsius = 18;
        int fahrenheit = (9/5) * celsius + 32;
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in celsius: " + celsius + "\nTemperature in Fahrenheit: " +
                fahrenheit + "\nTemperature in Kelvin: " + kelvin);

    }
}
