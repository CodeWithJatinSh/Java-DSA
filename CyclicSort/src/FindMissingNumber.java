public class FindMissingNumber {
    public static void main(String[] args) {
        // Input array: contains numbers in the range [0...n], 
        // but one number is missing
        int[] num = {4, 0, 2, 1};

        // Call the function to find the missing number
        int MissingNumber = MissingNumbers(num);

        // Print the result
        System.out.println(MissingNumber); // Expected: 3
    }

    // Function to find the missing number
    static int MissingNumbers(int[] arr) {
        int i = 0;
        int n = arr.length;

        // Place each number at its correct index
        // Example: 0 at index 0, 1 at index 1, 2 at index 2, etc.
        while (i < n) {
            int correct_index = arr[i];

            // Only swap if the number is within range
            // AND it's not already in the correct place
            // (arr[i] < arr.length ensures we don’t try to place 'n' out of bounds)
            if (arr[i] < arr.length && arr[i] != arr[correct_index]) {
                Swap(arr, i, correct_index);
            } else {
                // If already in the correct place, move forward
                i++;
            }
        }

        // After cyclic sort, the missing number will be
        // the first index where arr[index] != index
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        // If all numbers are in their correct place,
        // then the missing number is 'n'
        return arr.length;
    }

    // Swap two elements in the array
    private static void Swap(int[] arr, int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}

