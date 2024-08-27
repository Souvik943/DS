package org.questions.leetcode.recursion;

public class factorial {

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    static int findFactorial(int number) {
        if(number < 2) return 1;
        return number*findFactorial(number-1);
    }
}
