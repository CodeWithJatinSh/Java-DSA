// Importing Arrays utility for sorting
import java.util.Arrays;

// Main class
public class CeilingOfNumber {

    // Sort method to sort the input array in ascending order
    public void Sort(int[] arr) {
        Arrays.sort(arr);
    }

    /*
     * Function to find the ceiling of a target number in a sorted array.
     * The "ceiling" is the smallest number in the array that is greater than or equal to the target.
     *
     * Approach:
     * - Use binary search to find the ceiling efficiently.
     * - If arr[mid] == target → return index (as it is the ceiling).
     * - If arr[mid] < target → search in the right half (start = mid + 1).
     * - If arr[mid] > target → store index as potential ceiling and search left (end = mid - 1).
     */
    public int CeilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1; // To keep track of ceiling index if found

        // Binary Search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                // Exact match found — it's its own ceiling
                return mid;
            } else if (arr[mid] < target) {
                // Move right to find larger or equal value
                start = mid + 1;
            } else {
                // Potential ceiling found, but keep searching left for smaller ceiling
                ans = mid;
                end = mid - 1;
            }
        }

        return ans; // If no ceiling found, returns -1
    }

    // Main method to test the ceiling search
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 7, 9};  // Sample input array
        int find = 3;  // Target value for which we want to find ceiling

        CeilingOfNumber num = new CeilingOfNumber(); // Creating object of the class
        num.Sort(array); // Sort the array to apply binary search (in this case, already sorted)

        int index = num.CeilingNumber(array, find); // Find ceiling index

        if (index != -1) {
            // If a ceiling is found, print its index and value
            System.out.println("The Ceiling Number is at Index = " + index + " and the number is " + array[index]);
        } else {
            // If no ceiling exists (i.e., target is greater than all elements)
            System.out.println("Ceiling Number Not found");
        }
    }
}
