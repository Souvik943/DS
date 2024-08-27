package org.questions.leetcode.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,23,45,56,67,78};
        System.out.println(find(arr,56));
        System.out.println(find(arr,65));
        System.out.println(find(arr,100));
    }

    static boolean find(int[] arr, int target) {
        boolean founded = false;
        for(int i : arr) {
            if (i == target) {
                founded = true;
                break;
            }
            if(i > target) {
                break;
            }
        }
        return founded;
    }
}
