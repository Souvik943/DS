package org.questions.leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AllDuplicate {

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findDuplicates(arr));
    }

//--------------------- Brute Force --------------------------
//    static List<Integer> findDuplicates(int[] arr) {
//        List<Integer> ans = new ArrayList<>();
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int i:arr) {
//            if(hashSet.contains(i)) {
//                ans.add(i);
//            }
//            hashSet.add(i);
//        }
//        Collections.sort(ans);
//        return ans;
//    }

    static List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            int goToIndex = Math.abs(arr[i]) - 1;
            if(arr[goToIndex] < 0) {
                ans.add(goToIndex+1);
            }
            arr[goToIndex] = arr[goToIndex]*-1;
        }
        Collections.sort(ans);
        return ans;
    }
}
