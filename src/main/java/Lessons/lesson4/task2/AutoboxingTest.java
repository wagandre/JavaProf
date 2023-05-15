package Lessons.lesson4.task2;

public class AutoboxingTest {
    public static void main(String[] args) {


        int intValue = 8;

        Integer integerValue;

        integerValue = intValue;

        System.out.println(integerValue);

        Integer integer = 7;
        Integer integer1 = new Integer(7);

        int intValue2= integer1;
        System.out.println(intValue2);


    }
}
