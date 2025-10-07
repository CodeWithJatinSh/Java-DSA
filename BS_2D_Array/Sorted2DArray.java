import java.util.Arrays;
/**
 * Sorted2DArray class provides a method to search for a target value in a sorted 2D array.
 */
public class Sorted2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int find = 11;
        Sorted2DArray obj = new Sorted2DArray();
        int[] result = obj.searchInSortedMatrix(matrix, find);
        System.out.println("Element found at: " + Arrays.toString(result));
    }

    public int[] searchInSortedMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int m = arr[i].length;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j}; // Return the row and column indices
                }

            }
        }
        return new int[0];
    }

}