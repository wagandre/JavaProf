package Algorithms.lesson1.task1;

import java.util.Arrays;

public class BobbleSortSecond {

    public static void main(String[] args) {
        int[] list = {4, 3, 2, 1};
        System.out.println("Array before BubbleSorting : " + Arrays.toString(list));
        System.out.println(Arrays.toString(bubbleSortSecond(list)));
    }


    public static int[] bubbleSortSecond(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            boolean changed = false;
            for (int j = arr.length - 2; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    changed = true;
                }
                if (!changed)
                    break;
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;

    }
}
