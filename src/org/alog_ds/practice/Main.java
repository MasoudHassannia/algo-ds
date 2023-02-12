package org.alog_ds.practice;

import org.alog_ds.practice.sort.*;

public class Main {
    public static void main(String[] args) {

        int[] arrays = {4,1,7,-12,33,2,7};
       MyMergeSort.mergeSort(arrays,0,arrays.length);

        for (int array : arrays) {
            System.out.println(array);
        }
    }
}
