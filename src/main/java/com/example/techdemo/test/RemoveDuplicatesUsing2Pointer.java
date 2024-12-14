package com.example.techdemo.test;

public class RemoveDuplicatesUsing2Pointer {
    // Function to remove duplicates from a sorted array
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Handle empty array

        int i = 0; // Pointer for unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) { // Found a unique element
                i++; // Move pointer for unique position
                nums[i] = nums[j]; // Place the unique element
            }
        }

        return i + 1; // New length of the array
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3,4,4,4};
        int newLength = removeDuplicates(nums);

        // Print the array up to the new length
        System.out.println("New Length: " + newLength);
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
