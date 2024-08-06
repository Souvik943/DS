package org.questions.strings;

import java.util.ArrayList;
import java.util.List;

//Leetcode - 412 - LeetCode
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for(int i=1;i<=n;i++) {
            if(i%3==0) {
                answer.add("Fizz");
            }
            else if(i%5==0) {
                answer.add("Buzz");
            }
            else if(i%15==0) {
                answer.add("FizzBuzz");
            }
            else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}
