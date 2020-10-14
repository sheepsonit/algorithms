package com.sheepsonit;

import com.sheepsonit.allAlgorithms.DepthFirstSearch;

import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        List<String> lists = DepthFirstSearch.getFileTree("D:/test");
//        lists.forEach(System.out::println);
    }

    static int sum(int[] arr) {
        if (arr.length == 1)
            return arr[0];

        int[] tmpArr = new int[arr.length - 1];
        System.arraycopy(arr, 1, tmpArr, 0, tmpArr.length);

        return arr[0] + sum(tmpArr);
    }

    static int countElements(int[] list) {
        if (list.length == 0)
            return 0;
        if (list.length == 1)
            return 1;

        int[] tmpArr = new int[list.length - 1];
        System.arraycopy(list, 1, tmpArr, 0, tmpArr.length);

        return 1 + countElements(tmpArr);

    }

    static int max(int[] list) {
        if (list.length == 2)
            return list[0] > list[1] ? list[0] : list[1];

        int[] tmpArr = new int[list.length-1];
        System.arraycopy(list,1,tmpArr,0,tmpArr.length);
        int subMax = max(tmpArr);
        return subMax > list[0] ? subMax : list[0];
    }
}
