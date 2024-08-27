package org.questions.leetcode.strings;


// Check if a string is a palindrome

public class PS {
    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
    }

    static boolean isPalindrome(String str) {
        char[] strChar = str.toCharArray();
        int first = 0;
        int last = strChar.length-1;
        while(first<last) {
            if(strChar[first] != strChar[last]) return false;
            first++;
            last--;
        }
        return true;
    }
}
