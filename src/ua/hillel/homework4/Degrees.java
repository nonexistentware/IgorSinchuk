package ua.hillel.homework4;

public class Degrees {
    public static void main(String[] args) {
        double [] x = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120,
                        130, 140, 150, 160, 170 ,180, 190, 200, 210, 220, 230, 240, 250,
                        260, 270, 280, 290, 300, 310, 320, 330, 340, 350, 360};
        for (int i = 0; i < x.length; i++) {
            System.out.format("Значення сінусів для кута %.2f = %.4f\n", x[i], Math.sin(x[i]));
        }
    }
}