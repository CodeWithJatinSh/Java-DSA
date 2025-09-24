package Recursion.Array_Ques;
import java.util.ArrayList;
import java.util.List;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        // Contains all the Indices of the duplicate values
        List<Integer> indices = new ArrayList<>();
        DuplicateSearch(arr, 0, target, indices);

        System.out.println("Target " + target + " found at indices: " + indices);
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

    /**
     * Recursive method to find all indices of a target element in an array.
     * @param arr   The input array
     * @param index Current index to check
     * @param target The element we are searching for
     * @param list  List to store all found indices
     */
    static void DuplicateSearch(int[] arr, int index, int target, List<Integer> list) {
        // Base Case: If index reaches end of array, stop recursion
        if (index == arr.length) {
            return;
        }

        // If current element matches target, store its index
        if (arr[index] == target) {
            list.add(index);
        }

        // Recursive Step: Move to the next index
        DuplicateSearch(arr, index + 1, target, list);
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
