package org.questions.arrays;

import java.util.HashMap;

public class CountPairsWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(getPairsCount(arr,2));
    }
//------------------------ Brute-Force ----------------------------------
    static int getPairsCount(int[] arr, int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) count++;
            }
        }
        return count;
    }

}
