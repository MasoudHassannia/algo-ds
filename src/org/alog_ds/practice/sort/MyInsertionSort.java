package org.alog_ds.practice.sort;

public class MyInsertionSort {

    public static void insertionSort(int[] arrays){

        for (int i =1;i < arrays.length;i++) {
            int smallElement = arrays[i];

            int j;
            for(j = i; j > 0 && arrays[j-1] > smallElement;j--)
                arrays[j] = arrays[j-1];

            arrays[j] = smallElement;
        }
    }
}
