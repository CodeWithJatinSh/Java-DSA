import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Input array
        int[] arr = {18, 24, 3, 2, 1, 79};

        // Call mergesort function → returns a sorted array
        // NOTE: The original array will not be modified, because we use copyOfRange
        //int[] sortedArray = mergeSort(arr);

        // Print the sorted array
        //System.out.println(Arrays.toString(sortedArray));
        InPlaceMergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // Recursive function that divides the array into smaller parts
    public static int[] mergeSort(int[] arr) {
        // Base case → if the array has only one element, it is already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Find the middle index
        int mid = arr.length / 2;

        // Recursively split left half [0, mid)
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));

        // Recursively split right half [mid, end)
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the two sorted halves
        return merge(left, right);
    }

    // Function to merge two sorted arrays into one sorted array
    public static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length]; // final sorted array

        int i = 0; // pointer for left array
        int j = 0; // pointer for right array
        int k = 0; // pointer for ans array

        // Compare elements from left and right and put the smaller one into ans[]
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        // If any elements are left in left[], add them to ans[]
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }

        // If any elements are left in right[], add them to ans[]
        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans; // return merged sorted array
    }
    // Recursive merge sort
    public static void InPlaceMergeSort(int[] arr, int s, int e) {
        // Base case: if there is only one element, return
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        // Recursively divide left half
        InPlaceMergeSort(arr, s, mid);

        // Recursively divide right half
        InPlaceMergeSort(arr, mid, e);

        // Merge the two halves
        InPlaceMerge(arr, s, mid, e);
    }

    // Function to merge two sorted halves [s..mid) and [mid..e)
    public static void InPlaceMerge(int[] arr, int s, int m, int e) {
        int[] temp = new int[e - s];  // temp array to store merged result
        int i = s;     // pointer for left half
        int j = m;     // pointer for right half
        int k = 0;     // pointer for temp array

        // Merge until one half is exhausted
        while (i < m && j < e) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left half (if any)
        while (i < m) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right half (if any)
        while (j < e) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy sorted temp array back to original array
        System.arraycopy(temp, 0, arr, s, temp.length);
    }
    /*
===============================================
🧠 MERGE SORT EXPLANATION + DRY RUN
===============================================

🔹 mergeSort(arr, s, e)
- Recursively divides the array into halves until
  each subarray has one element (base case).
- Then merges them back in sorted order.

Example:
arr = [5, 3, 8, 4]
s = 0, e = 4

STEP 1:
mid = (0+4)/2 = 2
Divide into [5,3] and [8,4]

STEP 2:
Left half [5,3] -> mid = 1 -> divides into [5] and [3]
Both have one element → merge → [3,5]

STEP 3:
Right half [8,4] -> mid = 3 -> divides into [8] and [4]
Merge → [4,8]

STEP 4:
Merge [3,5] and [4,8]
→ Compare and merge → [3,4,5,8]

✅ Final sorted array = [3,4,5,8]

===============================================
🔹 Key Pointers:
- Base condition ensures no over-recursion.
- `System.arraycopy` correctly replaces sorted part.
- Index logic uses [s, e) (end exclusive).
- `mid = (s + e) / 2` ensures even splitting.
===============================================
*/
}

/*
-------------------------- EXPLANATION OF WORKING --------------------------
Merge Sort is a "Divide and Conquer" algorithm.
Steps:
1. Divide the array into two halves recursively until each sub-array has only one element.
2. Merge the sub-arrays in sorted order.

Example:
Input Array: [18, 24, 3, 2, 1, 79]

Step 1: Split into halves
[18, 24, 3]   and   [2, 1, 79]

Step 2: Further split
[18] [24, 3]   and   [2] [1, 79]

Step 3: Keep splitting until single elements
[18] [24] [3]   and   [2] [1] [79]

Step 4: Start merging (sorting while merging)
[24] + [3] → [3, 24]
[1] + [79] → [1, 79]

Step 5: Continue merging
[18] + [3, 24] → [3, 18, 24]
[2] + [1, 79] → [1, 2, 79]

Step 6: Final merge
[3, 18, 24] + [1, 2, 79] → [1, 2, 3, 18, 24, 79]

Final Sorted Array: [1, 2, 3, 18, 24, 79]

-------------------------- TIME COMPLEXITY --------------------------
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n log n)

Space Complexity: O(n) → because we create new arrays during merging.
*/


