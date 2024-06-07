package org.questions.arrays;

public class LargestElement {

    public static void main(String[] args) {
    int[] arr = {12,2,3,34,1};
        System.out.println(largestElement(arr));
    }

    static int largestElement(int[] arr) {
        int largest = arr[0];
        for(int i : arr) {
            if(i > largest) largest = i;
        }
        return largest;
    }
}
