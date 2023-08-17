package SummaryJava.lesson11.task4;

public class ArrayDequeTest {
    public static void main(String[] args) {
        MyArrayDeque deque = new MyArrayDeque();

        deque.addToHead(2);

        System.out.println(deque);

        deque.addToTail(4);

        System.out.println(deque);

        deque.addToHead(1);

        System.out.println(deque);
        System.out.println(deque.size());



    }

}
