package org.questions.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        productExceptSelf(arr);
    }

    static void productExceptSelf(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = 1;
        right[arr.length-1] = 1;
        for(int i = 1; i < arr.length; i++) {
            left[i] = left[i-1] * arr[i-1];
        }

        for(int i = arr.length-2; i>-1; i--) {
            right[i] = right[i+1] * arr[i+1];
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = left[i] * right[i];
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
