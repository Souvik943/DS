package org.questions.leetcode.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(twoSum(arr,9));
    }

//---------------------- Brute Force --------------------------------------------
//    static boolean twoSum(int[] arr, int target) {
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr.length; j++) {
//                if(arr[i] + arr[j] == target && arr[i]!=arr[j]) return true;
//            }
//        }
//        return false;
//    }

//    static boolean twoSum(int[] arr, int target) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int i : arr) {
//            int complement = target - i;
//            if(hashSet.contains(complement)) return true;
//            hashSet.add(i);
//        }
//        return false;
//    }

    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(hashMap.containsKey(complement)) return new int[]{hashMap.get(complement),i};
            hashMap.put(arr[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }
}
