package ua.hillel.homework12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopList {
    public static void main(String[] args) {

        String addItem = "y";
        String exit = "q";

        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (addItem.equals("y")) {
            System.out.println("Введіть назву товару: ");
            String itemName = scanner.next();
            System.out.println("Введіть кількість товару: ");
            int itemValue = scanner.nextInt();
            System.out.println(itemName + " " + itemValue);
            map.put(itemName, itemValue);
            System.out.println("Бажаєте додати ще товарів? y - так q - завершити покупки");
            addItem = scanner.next();
        } if (exit.equals("q")) {
            System.out.println("Елементів у списку: " + map.size());

            int sum = 0;
            for (int i : map.values()) {
                sum += sum+i;
            }
            System.out.println("Загальна кількість одиниць товіру у списку покупок :" + sum);
            System.exit(1);
        }



    }
}
