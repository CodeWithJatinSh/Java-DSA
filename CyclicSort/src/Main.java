import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input array: elements are in range [1...n]
        int[] num = {5, 4, 1, 2, 3};

        // Call the sorting function
        Sort(num);

        // Print the sorted array
        System.out.println(Arrays.toString(num));
    }

    // Cyclic Sort function
    static void Sort(int[] arr) {
        int pointer = 0;  // Start from the first index
        int n = arr.length;

        // Continue until pointer reaches the end of array
        while (pointer < n) {
            // Each element's "correct position" is (value - 1)
            // Example: value 3 should be at index 2
            int correct_index = arr[pointer] - 1;

            // If current element is not at its correct position,
            // swap it with the element at its correct index
            if (arr[pointer] != arr[correct_index]) {
                Swap(arr, pointer, correct_index);
            } else {
                // If already at correct position, just move to next element
                pointer++;
            }
        }
    }

    // Swap two elements in the array
    private static void Swap(int[] arr, int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
