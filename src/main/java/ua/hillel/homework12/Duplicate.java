package ua.hillel.homework12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> originalRandomList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i <100; i++) {
            originalRandomList.add(random.nextInt(50));

        }
        System.out.println(originalRandomList.size());
        System.out.println("Початкова колекція: " + originalRandomList.toString());

        originalRandomList = originalRandomList.stream().distinct().collect(Collectors.toList());
        System.out.println("Колекція після видалення дублікатів :" + originalRandomList.toString());

        HashSet<List<Integer>> listAfterRefactor = new HashSet<>();
        listAfterRefactor.add(originalRandomList);
        System.out.println("Кількість видкленних дублікатів: " + listAfterRefactor);

    }
}
