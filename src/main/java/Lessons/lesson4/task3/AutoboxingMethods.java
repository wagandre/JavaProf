package Lessons.lesson4.task3;

public class AutoboxingMethods {
    public static void main(String[] args) {
        Integer a = 9;
        print(a);


        Integer[] array = {7,9,22};
        System.out.println(getSum(array));



    }

    public static void print(int value) {
//        System.out.println(value);


    }

    public static Integer getSum(Integer[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;

    }
}
