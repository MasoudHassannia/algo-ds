package org.alog_ds.practice.sort;

public class MySelectionSort {

    public static void selectionSort(int[] arrays) {

        int unSortLength = arrays.length - 1;

        for (int i = unSortLength; i > 0; i--) {
            int big = 0;
            for (int j = 1; j <= i; j++) {
                if (arrays[j] > arrays[big]) {
                    big = j;
                }
            }
            swap(arrays, big, i);

        }

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
