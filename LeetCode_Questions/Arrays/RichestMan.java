/*
================= PROBLEM-4: RICHEST CUSTOMER WEALTH =================
https://leetcode.com/problems/richest-customer-wealth/description/
========================================================================

You are given an m × n integer grid `accounts` where `accounts[i][j]` is the amount
of money the i-th customer has in the j-th bank.

A customer's **wealth** is defined as the sum of money they have in all their bank accounts:
    wealth(i) = accounts[i][0] + accounts[i][1] + … + accounts[i][n-1]

Return the **maximum wealth** among all customers.

Example:
  Input: accounts = [[1,2,3], [3,2,1]]
  Output: 6
  Explanation:
    Customer 0 wealth = 1 + 2 + 3 = 6
    Customer 1 wealth = 3 + 2 + 1 = 6
    So the richest wealth = 6

Constraints & Complexity:
  • Time Complexity: O(m * n) — where m = number of customers (rows), n = number of banks (columns).
  • Space Complexity: O(1) extra space (you only use a few extra variables).

Approach:
  1. Initialize a variable `maxWealth = 0`.
  2. For each customer (row) i from 0 to m−1:
       a. Compute `sum = 0`.
       b. Loop over j from 0 to n−1: add `accounts[i][j]` to `sum`.
       c. Update: `maxWealth = max(maxWealth, sum)`.
  3. Return `maxWealth`.

========================================================================
*/
public class RichestMan {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,4,5,6},
                {2,4,5,8},
                {1,1,1,1}
        };
        int max = maximumWealth(accounts);
        System.out.println("The Maximum Wealth in the account is: "+max);
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = 0; // stores the maximum wealth found so far

        // Loop through each customer (row)
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0; // wealth of current customer

            // Loop through each bank account (column)
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            // Update maximum if current wealth is greater
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}