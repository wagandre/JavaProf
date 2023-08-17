package Lessons.lesson12;

import Lessons.lesson10.task2.Cat;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Banana", 97);
        map.put("Potato", 64);
        map.put("Cherry", 150);
        map.put("Strawberry", 120);
        map.put("Orange", 82);
        map.put("Carrot", 35);
        map.put("Tomato", 59);
        map.put("Potato", 72);

        System.out.println("Price for Carrot - " + map.get("Carrot"));
        System.out.println("price for " + map.get("Potato"));
        System.out.println("Price for nothing " + map.get("Apple"));
        System.out.println();
        System.out.println("Вывод всех элементов с for each!");

//        List<Cat> cats = new ArrayList<>();
//        for (Cat currentCat : cats) {
//        }
//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//        }
        int stringNumber = 0;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.printf("%d. Продукт - %s, цена - %d. \n", ++stringNumber, key, value);

        }
        System.out.println("All products");
        for (String product : map.keySet()) {
            System.out.println(product);
        }
        System.out.println("All prices");


        for (Integer price : map.values()) {
            System.out.println(price);
        }

//        Удалить из прайс листа помидоры и товары дороже 100
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        Cat cat = new Cat(10, "Black", 5);

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair  = iterator.next();
            if("Tomato".equals(pair.getKey()) || pair.getValue() > 100){
                iterator.remove();
            }

        }
        System.out.println("After remove...");
         stringNumber = 0;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.printf("%d. Продукт - %s, цена - %d. \n", ++stringNumber, key, value);
    }
}}