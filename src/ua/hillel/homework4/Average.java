package ua.hillel.homework4;

import java.util.Arrays;
import java.util.Random;

public class Average {
    public static void main(String[] args) {
        int [] arr   = new int[20];
        Random random = new Random();
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            average = average + arr[i];
        }
        System.out.println(Arrays.toString(arr));
            int result = average / arr.length;
            System.out.println("Середнє аріфметичне масиву: " + result);
    }
}
