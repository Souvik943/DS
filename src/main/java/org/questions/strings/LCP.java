package org.questions.strings;

import java.util.Arrays;

// LCP -> Longest Common Prefix
public class LCP {

    public static void main(String[] args) {

        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0 ; i< first.length ; i++) {
            if(first[i] != last[i]) break;
            result.append(first[i]);
        }

        return result.toString();
    }
}

