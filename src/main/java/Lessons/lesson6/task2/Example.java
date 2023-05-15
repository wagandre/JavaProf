package Lessons.lesson6.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> firstNumbers = new ArrayList<>();

        firstNumbers.add(1);
        firstNumbers.add(2);
        firstNumbers.add(3);
        firstNumbers.add(4);
        firstNumbers.add(5);
        System.out.println(firstNumbers);

        removeEvenValue(firstNumbers);
        System.out.println(firstNumbers);
        System.out.println("-------------------------------------------");


        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Java");
        words.add("World");
        words.add("Code");
        System.out.println(words);
        System.out.println(sumOfWords(words));

    }

    public static void removeEvenValue(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer currentElem = iterator.next();
            if (currentElem % 2 == 0) {
                iterator.remove();
            }

        }
    }

    public static int sumOfWords(List<String> words){
        int length = 0;
        for(String i : words ){
           length += i.length();
        }
return length;

    }





//        for (int i = 0; i < num.size(); i++) {
//            if (num.get(i) % 2 == 0) {
//                num.remove(num.get(i));

//                for(Integer value1 : num){
//                    System.out.println(value1);
//
//
//            }



    }


