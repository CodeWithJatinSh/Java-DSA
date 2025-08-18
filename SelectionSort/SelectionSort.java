import java.util.Arrays;
/**
 * SelectionSort class implements the Selection Sort algorithm to sort an array.
 */
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));
        selection(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static int Sort(int[] arr,int start,int end) {
        // Find the index of the maximum element in the array from start to end
        // This method returns the index of the maximum element in the specified range
        // It iterates through the array from start to end and keeps track of the maximum element's index
        int maxIndex = start;
        for(int i=start; i <= end; i++) {
            // If the current element is greater than the current maximum, update maxIndex
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    // Swap method to swap two elements in the array
    // This method takes an array and two indices, and swaps the elements at those indices
    // It is used to place the maximum element found in the unsorted portion at the end of that portion
    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * Selection sort algorithm that sorts an array in ascending order.
     * It repeatedly finds the maximum element from the unsorted part and swaps it with the last unsorted element.
     * 
     * @param arr the array to be sorted
     * This method sorts the array in place, modifying the original array.
     * It has a time complexity of O(n^2) and a space complexity of O(1).
     * * The algorithm works by iterating through the array, finding the maximum element in the unsorted portion,
     * and swapping it with the last element of the unsorted portion.
     *     * The process is repeated until the entire array is sorted.
     *     * Example:
     *    *     Original array: [64, 25, 12, 22, 11]
     *    *    *     After first pass: [64, 25, 12, 22, 11] (max is 64)
     *      *    *    *     After second pass: [25, 22, 12, 64, 11] (max is 25)
     *      *      *    *    *     After third pass: [22, 12, 25, 64, 11] (max is 22)
     *      *      *      *    *    *     After fourth pass: [12, 22, 25, 64, 11] (max is 12)
     *      *      *      *      *    *    *     After fifth pass: [11, 12, 22, 25, 64] (max is 11)
     *     *      *      *      *      *    *    *     Final sorted array: [11, 12, 22, 25, 64] 
     *     *     *      *      *      *    *    *    *     *     *     *      *      *      *    *    *    * 
     *   */
    public static void selection(int[] arr) { 
        // Iterate through the array from the end to the beginning
        // Find the maximum element in the unsorted portion and swap it with the last unsorted element
      for (int i = 0; i < arr.length - 1; i++) {
        // The last unsorted index is arr.length - i - 1
        int lastIndex = arr.length - i - 1;
        int max=Sort(arr, 0, lastIndex);
        Swap(arr, max, lastIndex);
    }
}
}

