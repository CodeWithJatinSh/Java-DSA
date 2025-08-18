public class RotatedArray {
    public static void main(String[] args) {
            int[] arr = {4, 5, 6, 7, 0, 1, 2};
            int find = 1;
            RotatedArray obj = new RotatedArray();
            int index = obj.Search(arr, find);
            if (index != -1) {
                System.out.println("Element " + find + " found at index: " + index);
            } else {
                System.out.println("Element " + find + " not found in the array.");
            }
        // Example with duplicates
        int[] arrWithDuplicates = {2,2,2,5, 6, 0, 0, 1, 2};
        int findDuplicate = 2;
        int indexDuplicate = obj.Search(arrWithDuplicates, findDuplicate);
        if (indexDuplicate != -1) {
            System.out.println("Element " + findDuplicate + " found at index: " + indexDuplicate);
        }
        else {
            System.out.println("Element " + findDuplicate + " not found in the array with duplicates.");
    }
    }
    public int Search(int[] arr, int target) {
    // Step 1: Find the pivot (index of the largest element)
    int pivot = FindPivotWithDuplicates(arr);

    // Step 2: If no pivot is found, the array is not rotated
    // So just do a normal binary search on the entire array
    if (pivot == -1) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    // Step 3: If the pivot itself is the target
    if (arr[pivot] == target) {
        return pivot;
    }

    // Step 4: Decide which half to search
    // If target is greater than or equal to the first element,
    // it must lie in the left (sorted) part
    if (target >= arr[0]) {
        return binarySearch(arr, target, 0, pivot - 1);
    }

    // Step 5: Otherwise, the target lies in the right part
    return binarySearch(arr, target, pivot + 1, arr.length - 1);
}

    public int FindPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    // Binary search loop
    while (start <= end) {
        // Calculate mid to avoid integer overflow
        int mid = start + (end - start) / 2;

        // Case 1: mid is pivot
        // If mid is less than end and greater than the next element, then mid is the pivot
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid; // Pivot found at mid

        // Case 2: mid-1 is pivot
        // If mid is greater than start and less than the previous element, then mid-1 is the pivot
        } else if (mid > start && arr[mid] < arr[mid - 1]) {
            return mid - 1; // Pivot found at mid - 1

        // Case 3: Left part is sorted
        // If the element at mid is greater than or equal to the start element,
        // it means the left half is sorted, so pivot must be in the right half
        } else if (arr[mid] >= arr[start]) {
            start = mid + 1; // Move to the right half

        // Case 4: Right part is sorted
        // If left is not sorted, then the right half must be sorted,
        // so pivot must be in the left half
        } else {
            end = mid - 1; // Move to the left half
        }
    }

    // If we reach here, it means no pivot was found (array is not rotated)
    return -1;
}
     
     public int FindPivotWithDuplicates(int[] arr){
        int start = 0;
        int end= arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            //Case 1-->
            if(arr[mid]==arr[start]&& arr[mid]==arr[end]){
                // Skip duplicates
                if(arr[start]>arr[start+1]) return start;
                start++;
                if(arr[end]<arr[end-1]) return end-1;
                end--;   
            }
            //Case 2-->
            // This case checks if the left half is sorted,

            // or if duplicates confuse us, whether the right half is unsorted.
            // If so, we move to the right side because the pivot must be there.
            else if(arr[mid]>arr[start] || (arr[mid]==arr[start] && arr[mid]>arr[end])){
                // Explanation:
                // 1. arr[start] < arr[mid]
                //    -> This means the left half is strictly increasing (sorted).
                //    -> So, the pivot must lie in the unsorted (right) half.
                //
                // 2. arr[start] == arr[mid] && arr[end] < arr[mid]
                //    -> We have duplicates at start and mid, so we can't tell if left is sorted.
                //    -> But if end < mid, it hints that the right side is unsorted,
                //       meaning the pivot must be in the right half.
                //
                // In both cases, we move our search to the right half of the array.
                start = mid + 1; // Skip left half including mid, pivot is in the right half
            }
            //Case 3-->
            // If the left half is unsorted, or if duplicates confuse us, we search in the left half.
            else {
                end = mid - 1; // Pivot is in the left half
            }
 
     }

        return -1; // No pivot found, array is not rotated
    }





    public int binarySearch(int[] arr, int target, int start, int end) {
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
        return -1; // Target not found
    }
}