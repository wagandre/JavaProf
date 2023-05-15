package Lessons.lesson7.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Java");
        list.add("Hello");
        list.add("World");
        list.add("Catt");

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String temp = iterator.next();
            if(temp.length()==5){
                break;
            }
            System.out.println(temp);
        }
        System.out.println("-------------------------------------------");

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());

        }

    }
}
