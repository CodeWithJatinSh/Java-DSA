import java.util.Arrays;
/* * This code implements the Insertion Sort algorithm in Java.
 * It sorts an array of integers in ascending order using the insertion sort technique.
 * The main method initializes an array, calls the insertionSort method, and prints the sorted array.
 */
public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 3, 8, 7, 4, 0,15, 10, 12, 11, 14, 13};
        insertionSort(arr);
         System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                // j<0 
                // If j is less than 0, it means we have reached the beginning of the array
                // If j is greater than 0, we compare the current element with the previous one
                // If the current element is greater than or equal to the previous element, we break out of the loop
                // This means that the current element is already in its correct position
                // If j is greater than 0, we compare the current element with the previous one
                // If the current element is less than the previous element, swap them
                // This method sorts the array in place, modifying the original array.
                // It has a time complexity of O(n^2) and a space complexity of O(1).
                if(arr[j]<arr[j-1]){
                    Swap(arr, j, j-1);
                } else {
                    break;
                }
        }
    }
    }
   public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   
}