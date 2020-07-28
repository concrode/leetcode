package dynamicProgramming;

/**
 * No.53 in leetcode
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
 * which is more subtle.
 *
 * =====================================================================================
 * Reference: https://www.youtube.com/watch?v=86CQq3pKSUw&t=5s
 * https://www.youtube.com/watch?v=jnoVtCKECmQ
 *
 */

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i <= nums.length - 1; i ++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }

    public static void main(String[] args) {
        MaximumSubarray m = new MaximumSubarray();
        int[] nums = {4, -1 ,5, -2, -1, 4, -2};
        System.out.println(m.maxSubArray(nums));
    }

}
