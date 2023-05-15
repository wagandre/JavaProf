package Lessons.lesson6.task1;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0, 5);
        numbers.add(1, 7);
        System.out.println(numbers);

        numbers.add(8);
        System.out.println(numbers);


        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(20);
        numbers1.add(30);
        System.out.println(numbers1);


        numbers1.addAll(numbers);
        System.out.println(numbers1);

        System.out.println(numbers1.remove(1));
        System.out.println(numbers1);

        System.out.println(numbers1.get(2));

        numbers1.set(0, 19);
        System.out.println(numbers1);


        System.out.println(numbers1.size());

        System.out.println(numbers1.isEmpty());


        System.out.println(numbers1.contains(18));

    }

    private static void addAll(List<Integer> numbers, int[] array) {

        for (int i : array) {
            numbers.add(i);
        }
    }

    private static void addFirst(List<Integer> numbers, int[] array) {
        if (array.length != 0) {
            numbers.add(array[0]);

        }
    }


}
