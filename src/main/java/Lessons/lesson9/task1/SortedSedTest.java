package Lessons.lesson9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSedTest {
    public static void main(String[] args) {

        SortedSet<String> set = new TreeSet<>();
        set.add("BBB");
        set.add("AAA");
        set.add("ccc");

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set);

        boolean result1 = set.remove("BBB");
        boolean result2 = set.remove("AA");

        System.out.println(result1 +  " " + result2);
        System.out.println(set);
        System.out.println("-------------------");

        List<String> list = new ArrayList<>();
        list.add("AAA");
        set.removeAll(list);
        System.out.println(set);













    }
}
