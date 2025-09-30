/*
================= PROBLEM-4: SHUFFLE THE ARRAY =================
https://leetcode.com/problems/shuffle-the-array/description/
================================================================

You are given the array nums consisting of 2n elements in the form:
[ x1, x2, ..., xn, y1, y2, ..., yn ].

Return the array in the form:
[ x1, y1, x2, y2, ..., xn, yn ].

Example:
  Input: nums = [2, 5, 1, 3, 4, 7], n = 3
  Output: [2, 3, 5, 4, 1, 7]

Explanation:
  - The first half is [2, 5, 1] → these are x1, x2, x3
  - The second half is [3, 4, 7] → these are y1, y2, y3
  - Interleaving them gives [2, 3, 5, 4, 1, 7].

Constraints & Complexity:
  • Time Complexity: O(n) — we loop through the first half of the array once.
  • Space Complexity: O(n) — we allocate a new array of size 2n to store the result.

Approach:
  1. Input array nums has 2n elements.
  2. Create a new array ans of size 2 * n.
  3. Iterate i from 0 to n−1:
       - Place nums[i] at ans[2 * i] (even index).
       - Place nums[i + n] at ans[2 * i + 1] (odd index).
  4. Return ans.
================================================================
*/

import java.util.Arrays;
public class ShuffleArray {
    public static void main(String[] args) {
        // Input array
        int[] arr = {0, 2, 1, 5, 3, 4, 6, 3};
        int n = arr.length/2;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
        public static int[] shuffle(int[] nums, int n) {
            // nums has 2n elements, so the result size is 2n
            int size = n * 2;

            // Create a new array to store the shuffled result
            int[] ans = new int[size];

            // Loop through only the first half of nums (x1..xn)
            for (int i = 0; i < n; i++) {
                // Place the element from the first half at even indices:
                // Example: i=0 → ans[0] = nums[0] (x1)
                //          i=1 → ans[2] = nums[1] (x2)
                ans[2 * i] = nums[i];

                // Place the element from the second half at odd indices:
                // Example: i=0 → ans[1] = nums[3] (y1)
                //          i=1 → ans[3] = nums[4] (y2)
                ans[2 * i + 1] = nums[i + n];
            }

            // After the loop, ans contains the interleaved array
            return ans;
        }

}