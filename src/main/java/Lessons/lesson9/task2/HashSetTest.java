package Lessons.lesson9.task2;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Banana");
        set1.add("Lemon");
        set1.add("Tree");

        Set<String> set2 = new HashSet<>(set1);
        Set<String> set3 = new HashSet<>(20);
        Set<String> set4 = new HashSet<>(20,0.9f);


        System.out.println("Set1 : " + set1 );
        System.out.println("Set1 : " + set2 );

        set1.remove("Banana");
        System.out.println("-----------------");
        System.out.println("Set1 : " + set1 );
        System.out.println("Set1 : " + set2 );
    }
}
