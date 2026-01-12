package org.leetcode;

public class LinearSearch {
    public static int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(LinearSearch.search(arr, 9));
        System.out.println(LinearSearch.search(arr, 2));
    }

}