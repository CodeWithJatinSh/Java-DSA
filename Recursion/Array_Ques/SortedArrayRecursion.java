package Recursion.Array_Ques;

public class SortedArrayRecursion {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 3, 4, 5};

        // Check if the array is sorted using recursion
        boolean ans = IsSorted(arr, 0);

        // Print the result
        System.out.println(ans); // true if sorted, false otherwise
    }

    /**
     * Recursive method to check if an array is sorted in ascending order.
     * @param arr   The array to check
     * @param index Current index to compare
     * @return true if the array is sorted, false otherwise
     */
    static boolean IsSorted(int[] arr, int index) {
        // Base Case: If we reach the last element,
        // it means all previous comparisons were correct → return true
        if (index == arr.length - 1) {
            return true;
        }

        // Check if current element is smaller than the next one,
        // AND recursively check the rest of the array.
        return arr[index] < arr[index + 1] && IsSorted(arr, index + 1);
    }
}

/*
----------------------------------------------
Working Example:
----------------------------------------------
Array = {1, 2, 3, 4, 5}

Step 1: index = 0 → arr[0] = 1 < arr[1] = 2 → true → go deeper
Step 2: index = 1 → arr[1] = 2 < arr[2] = 3 → true → go deeper
Step 3: index = 2 → arr[2] = 3 < arr[3] = 4 → true → go deeper
Step 4: index = 3 → arr[3] = 4 < arr[4] = 5 → true → go deeper
Step 5: index = 4 (last element) → base case → return true

Final Answer = true (array is sorted)

----------------------------------------------
If array = {1, 3, 2, 4}:

Step 1: index = 0 → 1 < 3 → true → go deeper
Step 2: index = 1 → 3 < 2 → false → recursion stops here
Final Answer = false (array not sorted)
----------------------------------------------
*/

