package ua.hillel.homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionSortMachine {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> general = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            originalList.add(random.nextInt(100));
        }

        System.out.println("Оригінальна колекція: " + originalList.toString());

        Integer[] arr = new Integer[originalList.size()];
        originalList.toArray(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);

            }
            if (arr[i] % 3 == 0) {
                odd.add(arr[i]);
            } else {
                general.add(arr[i]);
            }
        }
        System.out.println("Числа які діляться на 2: " + even.toString());
        System.out.println("Числа які діляться на 3: " + odd.toString());
        System.out.println("Числа які не діляться на 2 і 3: " + general.toString());
    }
}
