package homeworks.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TimeTest {
    public static void main(String[] args) {


        // 1.задание
        List<Integer> list = new ArrayList<>();
        int count;
        long time;


        // 2.задание
        for (int i = 0; i < 10000001; i++) {
            list.add(i);
        }

        // 3.Задание
         long startTime = System.currentTimeMillis();
        for (int temp : list) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println(time = endTime-startTime);


        // 4.задание
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            count = list.get(i);
//            System.out.println(count);
        }
        endTime = System.currentTimeMillis();
        System.out.println(time = endTime-startTime);

        // 5. задание
        startTime = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            count = list.get(i);
        } endTime = System.currentTimeMillis();
        System.out.println(time = endTime-startTime);

//        6. задание
        startTime = System.currentTimeMillis();
        for (int i = list.size(); i > 0; i--) {
            count = i;

        }

        endTime = System.currentTimeMillis();
        System.out.println(time = endTime-startTime);


//        7.задание
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        int number = 0;
        while (iterator.hasNext()) {
            number = iterator.next();
        }  endTime = System.currentTimeMillis();
        System.out.println(time = endTime-startTime);


//        8.задание
        startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator2 = list.listIterator();
        while (iterator2.hasNext()) {
            int listTemp = iterator2.next();
        } endTime = System.currentTimeMillis();
        System.out.println(time = endTime-startTime);
    }
}

