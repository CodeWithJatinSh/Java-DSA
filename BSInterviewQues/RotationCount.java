public class RotationCount {
    public static void main(String[] args) {
        // Example input: a rotated sorted array with duplicates
        int[] arr = {4, 4, 4, 5, 6, 7, 0, 1, 2};

        RotationCount obj = new RotationCount();

        // Call the function to find the number of times the array has been rotated
        int count = obj.countRotations(arr);

        System.out.println("Number of rotations: " + count);
    }

    // This method returns the number of rotations in a rotated sorted array
    // The number of rotations is the index of the smallest element (pivot)
    public int countRotations(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Binary search loop
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid is the pivot point
            // If mid is smaller than its previous and next element, it's the smallest
            // So we return its index as the number of rotations
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }

            // Case 2: mid-1 is the pivot point
            // If mid is greater than its previous element, and less than previous, return mid
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            // Case 3: Decide which side to search next
            // If elements at start >= mid, it means the pivot is in the left half
            // (because right side is sorted or contains higher values)
            if (arr[start] >= arr[mid]) {
                end = mid - 1; // Move search to the left half
            } else {
                // Else, the pivot must be in the right half
                start = mid + 1;
            }
        }

        // If no rotation (fully sorted), the smallest element is at index 0
        return 0;
    }
}
