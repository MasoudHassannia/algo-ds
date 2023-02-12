package org.alog_ds.practice.sort;

public class MyShelSort {


    public static void shellSort(int[] arrays) {

        for(int gap = arrays.length/2; gap > 0; gap/=2) {

            for(int i = gap;i < arrays.length;i++) {
                int newInt = arrays[i];

                int j= i;

                while (j >= gap && arrays[j-gap] > newInt) {
                    arrays[j] = arrays[j-gap];
                    j -= gap;
                }

                arrays[j] = newInt;
            }
        }

    }
}
