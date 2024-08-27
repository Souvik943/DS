package org.questions.leetcode.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,45,76,120,123};
        System.out.println(find(arr,5));
        System.out.println(find(arr,56));
    }

    static boolean find(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left<=right) {
            int mid = (left+right)/2;

            if(arr[mid] == target) return true;

            if(arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}
