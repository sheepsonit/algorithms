package com.sheepsonit.binarySearch;

public class BinarySearchAlgorithm {
    public static int search(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int middle = (high + low) / 2;
            int currItem = list[middle];

            if (currItem == item)
                return middle;
            if (currItem > item) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
