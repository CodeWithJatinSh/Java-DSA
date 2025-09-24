package Recursion.Array_Ques;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;
        int result = Search(arr, 0, target);

        System.out.println("Target Value: " + target + " is at index: " + result);
    }

    static int Search(int[] arr, int index, int target) {
        if (index == arr.length - 1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return Search(arr, index + 1, target);
    }
}
