package Lessons.lesson7.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTesting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Java");
        list.add("Hello");
        list.add("World");
        list.add("Cat");


        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String tmp = itr.next();
            if (tmp.length() % 2 == 0) {
                itr.remove();

            } else if (tmp.length() == 3) {
                System.out.println(tmp);
            }

        }
        System.out.println(list);


    }
}
