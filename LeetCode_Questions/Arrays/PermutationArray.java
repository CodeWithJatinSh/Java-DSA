/*
================= PROBLEM-1: BUILD ARRAY FROM PERMUTATION =================
https://leetcode.com/problems/build-array-from-permutation/description/
========================================================================

You are given a zero-based permutation array nums (0-indexed), which means
it contains every number from 0 to nums.length - 1 exactly once.

Your task is to build an array ans of the same length where:
    ans[i] = nums[nums[i]]

Return ans.

Example:
  Input: nums = [0,2,1,5,3,4]
  Output: [0,1,2,4,5,3]

Constraints & complexity:
  • Time Complexity: O(n) — single pass through the array.
  • Space Complexity: O(n) — new array of the same size is created.

Approach:
  1. Let n = nums.length.
  2. Initialize an array ans of size n.
  3. For each index i from 0 to n−1:
       - ans[i] = nums[nums[i]]
  4. Return ans.
========================================================================
*/
// Import required utility for printing arrays
import java.util.Arrays;

public class PermutationArray {
    public static void main(String[] args) {
        // Input array (this is the "permutation" array)
        int[] arr = {0, 2, 1, 5, 3, 4};

        // Call the function and print the result
        // Arrays.toString() is used for nice printing of arrays
        System.out.println(Arrays.toString(buildArray(arr)));
    }

    /**
     * Function to build a new array using the rule:
     * ans[i] = nums[nums[i]]
     *
     * Example:
     * Input:  nums = [0,2,1,5,3,4]
     * Output: ans  = [0,1,2,4,5,3]
     */
    public static int[] buildArray(int[] nums) {
        int n = nums.length;      // Length of the input array
        int[] ans = new int[n];   // Create a new array of same size

        // Rule: for each index i, place nums[nums[i]] in ans[i]
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        // Return the final built array
        return ans;
    }
}
