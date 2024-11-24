package interview.sorting;

public class InsertionSort {
    
    /**
     * Sorts an array using the Insertion Sort algorithm.
     * 
     * @param array The array to be sorted.
     */
    public static void insertionSort(int[] array) {
        int n = array.length; // Total number of elements in the array
        
        // Start from the second element (index 1) since the first element (index 0)
        // is considered sorted by default.
        for (int i = 1; i < n; i++) {
            int currentElement = array[i]; // Element to be inserted into the sorted subarray
            int j = i - 1; // Start comparing with the last element of the sorted subarray
            
            // Shift elements of the sorted subarray that are greater than
            // the currentElement one position to the right
            while (j >= 0 && array[j] > currentElement) {
                array[j + 1] = array[j]; // Move the larger element to the right
                j--; // Move the pointer to the left
            }
            
            // Insert the currentElement into its correct position
            array[j + 1] = currentElement;
        }
    }

    /**
     * Main method to test the Insertion Sort algorithm.
     */
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11}; // Example unsorted array
        
        System.out.println("Original array:");
        printArray(array); // Print the array before sorting
        
        insertionSort(array); // Call the insertionSort method to sort the array
        
        System.out.println("\nSorted array:");
        printArray(array); // Print the array after sorting
    }

    /**
     * Utility method to print the elements of an array.
     * 
     * @param array The array to be printed.
     */
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
