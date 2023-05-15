package Lessons.lesson6.task2;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(1);
        numbers3.add(2);
        numbers3.add(3);
        numbers3.add(4);
        numbers3.add(5);
        System.out.println(numbers3);
        changeValue(numbers3);
        System.out.println(numbers3);

        System.out.println("-----------------------------------------");


        List<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);

        List<Integer> newList = comeBack(num);

        System.out.println(num);
        System.out.println(newList);


    }

    private static void changeValue(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);


        }
    }

    public static List<Integer> comeBack (List <Integer> num){
        List<Integer> newList = new ArrayList<>();

        for(Integer i : num){
            newList.add(i*2);

        }
        return newList;

    }


}
