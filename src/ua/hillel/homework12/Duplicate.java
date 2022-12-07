package ua.hillel.homework12;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i <100; i++) {
            intList.add(random.nextInt(50));

        }
        System.out.println(intList.size());
        System.out.println("Початкова колекція: " + intList.toString());

        intList = intList.stream().distinct().collect(Collectors.toList());
        System.out.println("Колекція після видалення дублікатів :" + intList.toString());

        HashSet<List<Integer>> hs = new HashSet<>();
        hs.add(intList);
        int duplicateCounter = intList.size() - hs.size();
        System.out.println("Кількість видкленних дублікатів: " + duplicateCounter);

    }
}
