package Lessons.lesson9.task1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SedTest {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Java");
        set.add("Main");
        set.add("Andre");
        set.add("Day");
        System.out.println(set);

        for (String name : set) {
            System.out.println(name);
        }

        Iterator<String> iterator = set.iterator();
//        String elem = iterator.next();
//        while (iterator.hasNext()) {
//
//            if (elem.length() % 2 == 0) {
//                System.out.println(elem + " - True");
//            } else {
//                System.out.println(elem + " - False");
//
//            }
//        }
        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.println(elem + " " + (elem.length() % 2 == 0));
        }
    }
}