package ua.hillel.homework12;

import java.util.HashMap;
import java.util.Map;

public class ShopList {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Хліб", 2);
        map.put("Лимон", 10);
        map.put("Кавун", 3);
        map.put("Сир", 5);
        map.put("Лаваш", 7);
        map.put("Йогурт", 2);

        System.out.println("Елементів у списку: " + map.size());
//        System.out.println("" + map.values());

        int sum = 0;
        for (int i : map.values()) {
            sum += i;
        }
        System.out.println("Загальна кількість одиниць товіру у списку покупок :" + sum);
    }
}
