package org.leetcode;

public class BinarySearch {

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int target2 = 2;
        System.out.println("Index of " + target1 + " found at : " + search(arr, target1));
        System.out.println("Index of " + target2 + " found at : " + search(arr, target2));
    }
}
