package org.questions.arrays;

import java.util.ArrayList;
import java.util.Collections;
public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {1,0,1};
        moveZeroes(arr);
    }
//--------------------------------Brute-Force----------------------------------------

//    static void moveZeroes(int[] arr) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i : arr) {
//            if(i != 0) arrayList.add(i);
//        }
//        int[] newArr = new int[arr.length];
//        for(int i=0; i< arrayList.size(); i++) {
//            newArr[i] = arrayList.get(i);
//        }
//        for(int i = arrayList.size(); i< newArr.length; i++) {
//            newArr[i] = 0;
//        }
//        for(int i : newArr) {
//            System.out.print(i + " ");
//        }
//    }

    static void moveZeroes(int[] arr) {
        int j = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                j=i;
                break;
            }
        }
        if(j == -1) {
            return;
        }

        for(int i = j+1; i < arr.length; i++) {
            if(arr[i] != 0) {
                swap(arr,i,j);
                j++;
            }
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
