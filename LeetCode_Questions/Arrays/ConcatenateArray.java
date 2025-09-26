/*
================= PROBLEM-2: CONCATENATION OF ARRAY =================
https://leetcode.com/problems/concatenation-of-array/description/
========================================================================

Given an integer array nums of length n, return an array ans of length 2n
such that:

    * ans[i] == nums[i] for 0 ≤ i < n
    * ans[i + n] == nums[i] for 0 ≤ i < n

In other words, ans is formed by concatenating nums with itself.

Example:
  Input: nums = [1, 3, 2, 1]
  Output: [1, 3, 2, 1, 1, 3, 2, 1]

Constraints & complexity:
  • Time Complexity: O(n) — we loop through the array once to build ans.
  • Space Complexity: O(n) — we allocate a new array of size 2n to store the result.

Approach:
  1. Let n = nums.length.
  2. Create a new array ans of size 2 * n.
  3. For each index i from 0 to n−1:
       - ans[i] = nums[i]
       - ans[i + n] = nums[i]
  4. Return ans.
========================================================================
*/

import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args) {
        // Input array
        int [] arr = {0, 2, 1, 5, 3, 4};

        // Calling the function and printing result as a string
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    /**
     * Function to concatenate an array with itself
     * Example:
     * Input  = [1, 2, 3]
     * Output = [1, 2, 3, 1, 2, 3]
     */
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;        // Length of original array
        int [] ans = new int[2*n];  // New array of double size

        // Fill the new array
        for(int i = 0; i < n; i++) {
            ans[i] = nums[i];       // Copy element at position i
            ans[i+n] = nums[i];     // Copy element again at position i+n
        }

        // Return the concatenated array
        return ans;
    }
}
