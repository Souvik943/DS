package org.questions.leetcode.arrays;

import java.util.HashMap;

public class CountPairsWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(getPairsCount(arr,2));
    }
//------------------------ Brute-Force ----------------------------------
//    static int getPairsCount(int[] arr, int target) {
//        int count = 0;
//        for(int i=0; i<arr.length; i++) {
//            for(int j=i+1; j<arr.length; j++) {
//                if(arr[i] + arr[j] == target) count++;
//            }
//        }
//        return count;
//    }

    static int getPairsCount(int[] arr, int target) {
        int count = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(hashMap.containsKey(complement)) count++;
            hashMap.put(complement,i);
        }
        return count*2;
    }

}
