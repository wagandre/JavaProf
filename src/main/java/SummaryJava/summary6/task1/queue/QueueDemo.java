package SummaryJava.summary6.task1.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 25;

        for (int i = time; i >=0 ; i--) {
            queue.add(i);
        }
        System.out.println(queue);

        System.out.println("remove from collection");

        while(!queue.isEmpty()){
            Integer numberForRemove = queue.remove();
            System.out.println("removed number : "  + numberForRemove);
            System.out.println(queue);
        }
    }
}
