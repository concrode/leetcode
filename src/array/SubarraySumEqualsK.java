package array;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2 * 104
 * -1000 <= nums[i] <= 1000
 * -107 <= k <= 107
 *
 *
 */
public class SubarraySumEqualsK {
    /**
     * Instead of considering all the start and end points and then finding the sum for each subarray corresponding to
     * those points, we can directly find the sum on the go while considering different end points. i.e. We can choose
     * a particular start point and while iterating over the end points, we can add the element corresponding to
     * the end point to the sum formed till now. Whenever the sum equals the required kk value, we can update the
     * count value. We do so while iterating over all the end indices possible for every start index.
     * Whenever, we update the start index, we need to reset the sum value to 0.
     *
     *
     * Complexity Analysis**
     * Time complexity : O(n^2).We need to consider every subarray possible.
     *
     * Space complexity : O(1) Constant space is used.
     *
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum=0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    /**
     * https://www.youtube.com/watch?v=aYfwus5T3Bs&list=PLTNkreZiUTIL-S_VJBLRxlmGktAQtla-m&index=10
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum2(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

}
