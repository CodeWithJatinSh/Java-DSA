public class FindUniqueElement {
    public static void main(String[] args) {
        // Declare and initialize an array
        // Every element appears twice except one element
        int[] arr = {2, 3, 4, 1, 4, 3, 2, 1, 6};

        // Call the method to find the unique element
        int UElement = UniqueElement(arr);

        // Print the result
        System.out.println("The Unique Element in the array is: " + UElement);
    }

    // Method to find the unique element in the array
    private static int UniqueElement(int[] arr) {
        // Variable to hold the result of XOR operations
        int Unique = 0;

        // Enhanced for loop (for-each) to iterate through all elements in the array
        for (int n : arr) {
            // XOR the current number with 'Unique'
            // Duplicate numbers cancel out because x ^ x = 0
            // Only the unique element remains after all XOR operations
            Unique ^= n;
        }

        // Return the unique element
        return Unique;
    }
}
