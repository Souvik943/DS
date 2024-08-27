package org.questions.leetcode.arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {61 ,30 ,28 ,47 ,42 ,25 ,41 ,56 ,27 ,45 ,44 ,34 ,46 ,35 ,58 ,36 ,60 ,29 ,53 ,55 ,32 ,31 ,33 ,59 ,50 ,51 ,52 ,37 ,39 ,38 ,43 ,49 ,54 ,57 ,40 ,26 ,48};
        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for(int i : arr) {
            if(i > largest) largest = i;
        }
        for(int i : arr) {
            if(i > secondLargest && i != largest) secondLargest = i;
        }
        return secondLargest;
    }
}
