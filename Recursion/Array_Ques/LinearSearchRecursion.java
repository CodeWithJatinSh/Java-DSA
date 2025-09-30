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

        System.out.println(DuplicateSearch2(arr,0,target));
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

    /**
     * Searches for all occurrences of a 'target' value in an array 'arr' and returns
     * an ArrayList containing the indices where the target is found.
     * This is a recursive implementation that relies on combining results from subsequent calls.
     */
    static ArrayList<Integer> DuplicateSearch2(int[] arr, int index, int target) {
        // 1. Initialize the list for this specific function call.
        // This 'list' will store the index found at this level (if any) PLUS all indices
        // found by the recursive calls starting from 'index + 1'.
        ArrayList<Integer> list = new ArrayList<>();

        // --- Base Case ---
        // If 'index' reaches the array's length, the array has been fully traversed.
        if (index == arr.length) {
            return list; // Return the empty list, stopping the recursion.
        }

        // 2. Process the Current Element (Pre-recursion work).
        // If the element at the current 'index' matches the 'target', record it.
        if (arr[index] == target) {
            list.add(index);
        }

        // 3. Recursive Step (The "Divide" part).
        // Call the function for the rest of the array (starting from index + 1).
        // This call returns an ArrayList containing ALL target indices found *after* the current 'index'.
        ArrayList<Integer> AnsFromBelowCalls = DuplicateSearch2(arr, index + 1, target);

        // 4. Combine Results (The "Conquer" part).
        // Merge the indices found in the rest of the array (from the recursive call)
        // into the 'list' created at this function call.
        list.addAll(AnsFromBelowCalls);

        // 5. Return the result for this stage.
        return list;
    }

/*
// ======================================================================================================
// 🧠 WORKING EXPLANATION: Recursion with Backtracking (Index Collection)
// ======================================================================================================

// This function employs a **"divide and conquer"** approach to recursion. Instead of passing a
// single result list down through the calls, each call creates its own small list and then **combines** // its result with the results returned from the calls below it (the calls on the smaller subproblems).

// --- Core Mechanism ---

// 1. **Base Case:** When `index == arr.length`, the recursion stops, returning an **empty** list (`{}`).
//    This empty list becomes the foundation for the combination process as the calls unwind.

// 2. **Recursive Step:** Each function call does two things:
//    a. **Self-Check:** It checks `arr[index]` and, if the target is found, it adds that specific `index`
//       to its local `list`.
//    b. **Sub-Problem:** It asks the next call (`index + 1`) to find all indices in the remainder of the array.
//       This result is stored in `AnsFromBelowCalls`.

// 3. **Combination (Backtracking):** The critical step is `list.addAll(AnsFromBelowCalls);`.
//    This **merges** the indices found in the rest of the array (which were collected deeper in the call stack)
//    into the current call's `list`. As the calls return, the list of indices grows, working its way
//    back up to the initial function call.

// --- Trace Example: arr = {1, 2, 5, 2}, target = 2 ---

// - **Call 4 (index=3, arr[3]=2):** //   - Self-Check: `list` = {3}.
//   - Calls index=4 (Base Case). Returns `AnsFromBelowCalls` = {}.
//   - Combine: `list.addAll({})`. Returns **{3}**.

// - **Call 3 (index=2, arr[2]=5):**
//   - Self-Check: `list` = {}.
//   - Calls index=3. Returns `AnsFromBelowCalls` = {3}.
//   - Combine: `list.addAll({3})`. Returns **{3}**.

// - **Call 2 (index=1, arr[1]=2):**
//   - Self-Check: `list` = {1}.
//   - Calls index=2. Returns `AnsFromBelowCalls` = {3}.
//   - Combine: `list.addAll({3})`. Returns **{1, 3}**.

// - **Call 1 (index=0, arr[0]=1):**
//   - Self-Check: `list` = {}.
//   - Calls index=1. Returns `AnsFromBelowCalls` = {1, 3}.
//   - Combine: `list.addAll({1, 3})`. Returns the final list: **{1, 3}**.
*/
}

