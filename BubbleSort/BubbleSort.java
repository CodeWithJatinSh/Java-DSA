import java.util.Arrays;
/**
 * BubbleSort class implements the Bubble Sort algorithm to sort an array.
 */ 
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void BubbleSort(int[] arr){
        boolean swapped = false;
        // Bubble Sort algorithm implementation
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length-i-1; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true; // Set swapped to true if a swap occurs
                }

    }
     
        if(!swapped) {
                break; // If no swaps occurred, the array is sorted
        }
}
}
}