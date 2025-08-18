import java.util.Arrays;

/**
 * Searching class provides a method to search for a target value in a 2D array.
 */
public class Searching{
    public static void main(String[] args){
        int[][] arr ={
            {18,9,12,15},
            {20,25,30,35},
            {40,45,50,55},
            {60,65,70,75}
        };

        int find = 30;
        Searching obj = new Searching();
        int[] result = obj.Search(arr, find);
        System.out.println(Arrays.toString(result));
        // Output: [1, 2] since 30 is found at row 1, column 2
    }

    public int[] Search(int[][] arr, int target){
        
        for(int row = 0; row < arr.length; row++){
            int m = arr[row].length;
            for(int col=0;col<m;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                };
            };
        };
        return new int[]{-1,-1}; // Return -1 if target is not found
    }
}