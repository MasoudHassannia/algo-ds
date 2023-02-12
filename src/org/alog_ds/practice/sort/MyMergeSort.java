package org.alog_ds.practice.sort;

public class MyMergeSort {

    public static void mergeSort(int[] arrays, int start,int end) {

        if(end-start <2)
            return;

        int mid = (start+ end)/2;
        mergeSort(arrays,start,mid);
        mergeSort(arrays, mid,end);

        merge(arrays,start,mid,end);


    }

    private static void merge(int[] arrays, int start, int mid, int end) {

        if(arrays[mid-1]<= arrays[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];
        while (i < mid && j < end)
            tempArray[tempIndex++] = arrays[i] <= arrays[j] ? arrays[i++] : arrays[j++];

        System.arraycopy(arrays,i,arrays,start+tempIndex,mid-i);
        System.arraycopy(tempArray,0,arrays,start,tempIndex);
    }
}
