package org.alog_ds.practice.sort;


public class MyQuickSort {

    public static void quickSort(int[] arrays, int start, int end) {
        if (end - start < 2)
            return;

        int pivotIndex = partition(arrays, start, end);
        quickSort(arrays, start, pivotIndex);
        quickSort(arrays, pivotIndex + 1, end);
    }

    private static int partition(int[] arrays, int start, int end) {

        int pivot = arrays[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && arrays[--j] >= pivot) ;
            if(i < j)
                arrays[i] = arrays[j];

            while (i<j && arrays[++i] <= pivot);
                if(i < j)
                    arrays[j] = arrays[i];
        }

        arrays[j] = pivot;
        return j;
    }

    public static void quickSort1(int[] arrays, int start, int end){
        if(start >= end)
            return;

        int pivot = partition1(arrays,start,end);

        quickSort1(arrays,start,pivot-1);
        quickSort1(arrays,pivot+1, end);

    }

    private static int partition1(int[] arrays, int start, int end) {
        int pivot = arrays[end];
        int boundary = start-1;

        for(int i = start;i<= end;i++)
            if (arrays[i] <= pivot)
                swap(arrays, i, ++boundary);

        return boundary;
    }

    private static void swap(int[] arrays, int i, int j) {
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
}
