package interview.spring.ds.sorting;

public class SelectionSortExample {

    // Method to perform Selection Sort on an array
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Length of the array

        // Outer loop for each position in the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index has the smallest element
            int minIndex = i;

            // Inner loop to find the smallest element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                // If a smaller element is found, update minIndex
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element found with the element at the current index
            // Swap only if minIndex is different from i
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the Selection Sort algorithm
    public static void main(String[] args) {
        // Input array to be sorted
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr); // Print the array before sorting

        // Perform Selection Sort
        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr); // Print the array after sorting
    }
}
