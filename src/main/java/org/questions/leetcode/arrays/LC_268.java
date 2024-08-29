package org.questions.leetcode.arrays;

//LC - 268 - Find missing integer in an array

public class LC_268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,2,4}));
    }

//    static int missingNumber(int[] nums) {
//        int actualSum = 0;
//        int expectedSum = (nums.length*(nums.length+1))/2;
//        for(int i:nums) {
//            actualSum += i;
//        }
//        return expectedSum - actualSum;
//    }

    static int missingNumber(int[] nums) {
        int actualXOR = 0;

        for(int i=0; i<=nums.length; i++) {
            actualXOR = actualXOR ^ i;
        }

        for(int i: nums) {
            actualXOR = actualXOR ^ i;
        }

        return actualXOR;
    }
}
