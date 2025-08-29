import java.util.ArrayList;
import java.util.List;
// PROBLEM -> https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class DisappearingNumber {
    public static void main(String[] args) {
        DisappearingNumber obj = new DisappearingNumber();

        // Input array: contains numbers in the range [1...n], 
        // some numbers may be missing, and some may be duplicated
        int[] arr = {4,3,2,7,8,2,3,1};

        // Print the list of missing numbers
        System.out.println(obj.findDisappearedNumbers(arr)); 
        // Expected Output: [5, 6]
    }

    // Function to find all numbers that disappeared
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int pointer = 0;
        int n = arr.length;

        // Step 1: Cyclic Sort - place each number at its correct index
        // Example: number 3 should go to index 2
        while (pointer < n) {
            int correct_index = arr[pointer] - 1;

            // Only swap if the number is not already at its correct position
            if (arr[pointer] != arr[correct_index]) {
                Swap(arr, pointer, correct_index);
            } else {
                // Move pointer only if current number is already correct
                pointer++;
            }
        }

        // Step 2: Collect all missing numbers
        // After sorting, if a number is missing,
        // its position will not have the expected value
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1); // The missing number
            }
        }

        return ans;
    }

    // Helper function to swap two elements in the array
    void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
