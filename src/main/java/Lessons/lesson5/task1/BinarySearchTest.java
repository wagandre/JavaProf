package Lessons.lesson5.task1;

import static Lessons.lesson5.task1.BinarySearch.search;
import static Lessons.lesson5.task1.BinarySearch.searchBinary;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        numbers[7] = 20;
//        System.out.println(numbers[7]);

        String[][] words = new String[5][5];
        words[2][3] = "Hello!";

        boolean[][][] booleans = new boolean[3][3][3];
        booleans[0][1][2] = true;

        int[] numbers1 = {1, 3, 6, 9, 12, 16, 17, 18, 20, 21, 28, 38, 100};

//        System.out.println(search(numbers1,99));
//        System.out.println(BinarySearch.search(numbers1,17));

        System.out.println(searchBinary(numbers1,17));



        System.out.println();


    }
}
