package ua.hillel.homework4;

import java.util.Arrays;
import java.util.Random;

public class ArrayEven {
    public static void main(String[] args) {
        int arr [] = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
