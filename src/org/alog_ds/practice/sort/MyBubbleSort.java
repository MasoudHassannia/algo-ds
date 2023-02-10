package org.alog_ds.practice.sort;

import java.util.stream.IntStream;

public class MyBubbleSort {

    public static void bubbleSort(int[] arrays) {

        int unsortedArray = arrays.length;

        for (int i = unsortedArray - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrays[j] > arrays[j + 1])
                    swap(arrays, j, j + 1);
            }
        }

        for (int array : arrays) {
            System.out.println(array);
        }
    }

    public static void bubbleSortJava8(int[] arrays) {

        int n = arrays.length;

        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - i))
                .forEach(j -> {
                    if (arrays[j - 1] > arrays[j]) {
                        swap(arrays, j, j - 1);
                    }
                });

        for (int array : arrays) {
            System.out.println(array);
        }
    }

    private static void swap(int[] arrays, int i, int j) {

        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
}
