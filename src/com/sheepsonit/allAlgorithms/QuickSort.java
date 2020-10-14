package com.sheepsonit.allAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static int[] qSort(int[] arr) {
        if (arr.length < 2)
            return arr;
        int pivot = arr[0];
        int[] less = Arrays.stream(arr).filter(num -> num < pivot).toArray();
        int[] greater = Arrays.stream(arr).filter(num -> num > pivot).toArray();
        System.arraycopy(qSort(less),0,arr,0,less.length);
        arr[less.length] = pivot;
        System.arraycopy(qSort(greater),0,arr,less.length+1,greater.length);
        return arr;
    }
}
