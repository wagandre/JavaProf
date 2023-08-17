package SummaryJava.lesson11.task3;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Hello");
        queue.add("World");
        queue.add("I");
        queue.add("study");
        queue.add("Java");

        System.out.println(queue);

       while(!queue.isEmpty()){
           System.out.println(queue.poll());
       }

    }
}
