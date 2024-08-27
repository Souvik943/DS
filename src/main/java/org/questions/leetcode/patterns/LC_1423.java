package org.questions.leetcode.patterns;

//LC - 1423 - Maximum Points You Can Obtain from Cards

public class LC_1423 {
    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{9,7,7,9,7,7,9},7));
    }

    static int maxScore(int[] cardPoints, int k) {
        // Define leftSum,rightSum and maxSum
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;

        //we check the extreme left sum for k values
        for (int i = 0; i < k; i++) {
            leftSum = leftSum + cardPoints[i];
            maxSum = leftSum;
        }

        //We define an index on the right hand side
        int rightIndex = cardPoints.length-1;

        //Now we reduce the elements on the left and start adding the elements on the right and start adding them
        for (int i = k-1; i >= 0; i--) {
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[rightIndex];
            rightIndex = rightIndex - 1;

            //Find out the maximum sum
            maxSum = Math.max(maxSum,leftSum + rightSum);
        }
        return maxSum;
    }
}
