package Recursion.Array_Ques;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 3, 4, 5};

        // Target element we want to search
        int target = 4;

        // Start the search from index 0
        int result = Search(arr, 0, target);

        // Print the result
        System.out.println("Target Value: " + target + " is at index: " + result);
    }

    /**
     * Recursive Linear Search
     * @param arr The array in which we are searching
     * @param index Current index to check
     * @param target Value we want to find
     * @return Index of target if found, otherwise -1
     */
    static int Search(int[] arr, int index, int target) {
        // Base Case 1: If index reaches the end of the array, return -1 (not found)
        if (index == arr.length - 1) {
            return -1;
        }

        // Base Case 2: If current element matches the target, return index
        if (arr[index] == target) {
            return index;
        }

        // Recursive Step: Check the next element
        return Search(arr, index + 1, target);
    }
}

/*
----------------------------------------------
Working Example:
----------------------------------------------
Array = {1, 2, 3, 4, 5}, Target = 4

1. Start at index = 0 → arr[0] = 1 ≠ 4 → go deeper
2. Index = 1 → arr[1] = 2 ≠ 4 → go deeper
3. Index = 2 → arr[2] = 3 ≠ 4 → go deeper
4. Index = 3 → arr[3] = 4 == target → return 3

So, output = "Target Value: 4 is at index: 3"

If the target was not in the array:
- The recursion would eventually reach the last index,
- Base case `if (index == arr.length - 1)` would trigger,
- And it would return -1.
----------------------------------------------
*/
