package Lessons.lesson15.task1;

public class BooleanTest {
    public static void main(String[] args) {
//        int b = 1; false
//        int c = 5; false

//        int b = 1; false
//        int c = 6; false

//        int b = 0; false
//        int c = 5; false

        int b = 0;
        int c = 6;

        System.out.println(test1(b,c));
        System.out.println(test2(b,c));
    }

    public static boolean test1(int b, int c) {
        return !((b != 0) || (c <= 5));

    }

    public static boolean test2(int b, int c) {
        return (b == 0) && (c > 5);

    }

}
