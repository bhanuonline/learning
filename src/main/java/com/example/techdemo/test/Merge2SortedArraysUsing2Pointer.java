package com.example.techdemo.test;

import java.util.Arrays;

public class Merge2SortedArraysUsing2Pointer {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0}; // First array with extra space
        int m = 3; // Number of valid elements in nums1
        int[] nums2 = {2, 4, 6}; // Second array
        int n = 3; // Number of elements in nums2

        merge(nums1, m, nums2, n);

        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for the last valid element in nums1
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last position in nums1

        // Merge from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 has remaining elements, add them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        // No need to check for nums1 as it's already in place
    }
}
