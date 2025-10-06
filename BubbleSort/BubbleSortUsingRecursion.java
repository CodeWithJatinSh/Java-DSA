import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Call the recursive bubble sort with initial parameters
        bubbleSort(arr, arr.length - 1, 0);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Recursive Bubble Sort Function
    public static void bubbleSort(int[] arr, int r, int c) {
        // Base Case → when all passes are complete
        if (r == 0) {
            return;
        }

        // Step 1 → If column index (c) is less than current limit (r)
        if (c < r) {
            // Compare adjacent elements
            if (arr[c] > arr[c + 1]) {
                // Swap elements
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            // Move to next element (increase c)
            bubbleSort(arr, r, c + 1);
        }
        // Step 2 → One pass completed, restart for next pass
        else {
            bubbleSort(arr, r - 1, 0);
        }
    }
}

/*
------------------------------------------------------
💡 HOW THIS CODE WORKS (CONCEPT + DRY RUN)
------------------------------------------------------

🔹 Concept Recap:
Bubble Sort repeatedly compares adjacent elements.
After each complete pass, the largest element is "bubbled up" to the end.
Recursive logic:
  → Inner recursion (controlled by `c`) = one full pass
  → Outer recursion (controlled by `r`) = total passes

------------------------------------------------------
🔹 DRY RUN EXAMPLE
Array = [64, 34, 25, 12, 22, 11, 90]

Initial Call:
bubbleSort(arr, 6, 0)

--------------------------------------------
Pass 1 (r = 6):
--------------------------------------------
Comparisons:
c=0 → 64 > 34 → swap → [34, 64, 25, 12, 22, 11, 90]
c=1 → 64 > 25 → swap → [34, 25, 64, 12, 22, 11, 90]
c=2 → 64 > 12 → swap → [34, 25, 12, 64, 22, 11, 90]
c=3 → 64 > 22 → swap → [34, 25, 12, 22, 64, 11, 90]
c=4 → 64 > 11 → swap → [34, 25, 12, 22, 11, 64, 90]
c=5 → 64 < 90 → no swap
→ Largest element (90) bubbled to end.
→ Next call: bubbleSort(arr, 5, 0)

--------------------------------------------
Pass 2 (r = 5):
--------------------------------------------
Now we ignore last element (since 90 is sorted).
c=0 → 34 > 25 → swap → [25, 34, 12, 22, 11, 64, 90]
c=1 → 34 > 12 → swap → [25, 12, 34, 22, 11, 64, 90]
c=2 → 34 > 22 → swap → [25, 12, 22, 34, 11, 64, 90]
c=3 → 34 > 11 → swap → [25, 12, 22, 11, 34, 64, 90]
c=4 → 34 < 64 → no swap
→ bubbleSort(arr, 4, 0)

--------------------------------------------
Pass 3 (r = 4):
--------------------------------------------
c=0 → 25 > 12 → swap → [12, 25, 22, 11, 34, 64, 90]
c=1 → 25 > 22 → swap → [12, 22, 25, 11, 34, 64, 90]
c=2 → 25 > 11 → swap → [12, 22, 11, 25, 34, 64, 90]
c=3 → 25 < 34 → no swap
→ bubbleSort(arr, 3, 0)

--------------------------------------------
Pass 4 (r = 3):
--------------------------------------------
c=0 → 12 < 22 → no swap
c=1 → 22 > 11 → swap → [12, 11, 22, 25, 34, 64, 90]
c=2 → 22 < 25 → no swap
→ bubbleSort(arr, 2, 0)

--------------------------------------------
Pass 5 (r = 2):
--------------------------------------------
c=0 → 12 > 11 → swap → [11, 12, 22, 25, 34, 64, 90]
c=1 → 12 < 22 → no swap
→ bubbleSort(arr, 1, 0)

--------------------------------------------
Pass 6 (r = 1):
--------------------------------------------
c=0 → 11 < 12 → no swap
→ bubbleSort(arr, 0, 0)

--------------------------------------------
Base Case (r = 0) → return
Array fully sorted ✅

------------------------------------------------------
✅ FINAL OUTPUT:
Original array: [64, 34, 25, 12, 22, 11, 90]
Sorted array:   [11, 12, 22, 25, 34, 64, 90]
------------------------------------------------------
*/
