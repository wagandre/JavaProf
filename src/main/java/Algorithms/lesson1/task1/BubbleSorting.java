package Algorithms.lesson1.task1;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] list = {4,3,2,1};
        System.out.println("Array before BubbleSorting : " + Arrays.toString(list));
        System.out.println(Arrays.toString(bubbleSort(list)));
    }


    public static int[] bubbleSort(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
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
