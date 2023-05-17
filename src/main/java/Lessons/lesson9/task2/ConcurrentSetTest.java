package Lessons.lesson9.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSetTest {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        set.add("Java");
        set.add("Cat");
        set.add("Dog");
        set.add("Animal");
        set.add("Tree");

        Iterator<String> iterator = set.iterator();
        int counter = 1;

        List<String> itemsForRemove = new ArrayList<>();
        itemsForRemove.add("Banana");
        itemsForRemove.add("Cat");


        while (iterator.hasNext()) {
            String item = iterator.next();

            System.out.printf("%d. %s, length: %d\n", counter++, item, item.length());

            if (itemsForRemove.contains(item)) {
                iterator.remove();
            }

        }
        System.out.println();
        System.out.println(set);
    }
}
