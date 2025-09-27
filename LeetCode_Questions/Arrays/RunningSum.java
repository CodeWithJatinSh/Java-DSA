/*
================= PROBLEM-3: RUNNING SUM OF 1D ARRAY =================
https://leetcode.com/problems/running-sum-of-1d-array/description/
========================================================================

Given an integer array nums of length n, the **running sum** array is defined
such that:

    runningSum[i] = nums[0] + nums[1] + … + nums[i]

Return the running sum array.

Example:
  Input:  nums = [1, 2, 3, 4]
  Output: [1, 3, 6, 10]
  Explanation:
    runningSum[0] = 1
    runningSum[1] = 1 + 2 = 3
    runningSum[2] = 1 + 2 + 3 = 6
    runningSum[3] = 1 + 2 + 3 + 4 = 10

Constraints & Complexity:
  • Time Complexity: O(n) — single pass over the array.
  • Space Complexity: O(n) — new result array of size n, or you could do it in-place
    (modifying nums) to get O(1) extra space if allowed.

Approach:
  1. Let n = nums.length.
  2. Create an array ans of size n (or reuse nums).
  3. Maintain a `sum` variable initialized to 0.
  4. For each index i from 0 to n − 1:
       - sum += nums[i]
       - ans[i] = sum
  5. Return ans.
========================================================================
*/
import java.util.Arrays;  // Import Arrays utility class for printing arrays in readable format

public class RunningSum {
    public static void main(String[] args) {
        // Input array
        int[] arr = {0, 2, 1, 5, 3, 4};

        // Calling the function and printing the result as a string
        // Arrays.toString() converts the array into a human-readable string format
        System.out.println(Arrays.toString(Sum(arr)));
    }

    /**
     * This function calculates the running sum of an array.
     *
     * Example:
     * Input:  [0, 2, 1, 5, 3, 4]
     * Output: [0, 2, 3, 8, 11, 15]
     *
     * Running sum means:
     *   nums[i] = sum of all elements from nums[0] to nums[i]
     */
    public static int[] Sum(int[] nums) {
        // Start from index 1, because nums[0] is already the first element
        for (int i = 1; i < nums.length; i++) {
            // Add previous element's value to current element
            nums[i] = nums[i - 1] + nums[i];
        }
        // Return the modified array (with running sums)
        return nums;
    }
}
