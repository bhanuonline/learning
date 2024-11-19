package interview.spring.ds.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        // Initialize the array to be sorted
        int arr[] = {4, 9, 0, 6, -1, 5, 23};
        int n = arr.length; // Store the length of the array

        // Outer loop controls the number of passes required (n-1 passes for n elements)
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Track if any elements were swapped during this pass

            // Inner loop performs comparisons and swaps, with decreasing range for optimization
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // Temporary variable to hold the value for swapping
                    arr[j] = arr[j + 1]; // Swap the larger element to the right
                    arr[j + 1] = temp; // Complete the swap
                    swapped = true; // Mark that a swap occurred
                }
            }

            // If no swaps were made during the inner loop, the array is already sorted
            if (!swapped) break;
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]); // Output each element of the sorted array
        }
    }
}
