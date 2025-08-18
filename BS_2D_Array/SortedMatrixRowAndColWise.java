import java.util.Arrays;
/**
 * SortedMatrixRowAndColWise class provides a method to search for a target value in a sorted 2D array.
 */
public class SortedMatrixRowAndColWise {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int find = 39;
        SortedMatrixRowAndColWise obj = new SortedMatrixRowAndColWise();
        int[] result = obj.SortedSearch(matrix,find);
        System.out.println("Element found at: " + Arrays.toString(result));
}
     public int[] SortedSearch(int[][] arr, int target) {{
        int row =0; 
        int col = arr[0].length - 1; // Start from the top-right corner

        while(row< arr.length && col >=0){
            if(arr[row][col]== target) return new int[]{row, col}; // Target found
            if(arr[row][col]<target){
                row++; // Move down if current element is less than target
            }
            else{
                // element  > target
                col--; // Move left if current element is greater than target
            } 
        }
        return new int[]{-1,-1}; // Return -1 if target is not found
     }
}
}