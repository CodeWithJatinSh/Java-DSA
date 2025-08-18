import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    // Sort method
    public void Sort(int[] arr) {
        Arrays.sort(arr);
    }

    // Binary Search Method
    public int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.Sort(array);

        System.out.println("Your Array is:");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println("Enter the target element to search:");
        int target = scanner.nextInt();

        int result = binarySearch.Search(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}