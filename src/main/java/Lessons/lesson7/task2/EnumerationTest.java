package Lessons.lesson7.task2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("Dog");
        list.add("Java");
        list.add("Hello");
        list.add("World");
        list.add("Cat");

        Enumeration<String> en = list.elements();

        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
