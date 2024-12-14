package com.example.techdemo.test;

import java.util.Arrays;

public class ThreeSumClosestUsing2Pointer {
    public static void main(String[] args) {
        ThreeSumClosestUsing2Pointer solution = new ThreeSumClosestUsing2Pointer();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println("Closest Sum: " + solution.threeSumClosest(nums, target)); // Output: 2
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Step 1: Sort the array
        int closestSum = Integer.MAX_VALUE / 2; // Start with a large value

        for (int i = 0; i < nums.length - 2; i++) { // Step 2: Fix one number
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) { // Step 3: Use two pointers
                int sum = nums[i] + nums[left] + nums[right];

                // Step 4: Update closest sum if needed
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                // Step 5: Adjust pointers
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum; // If the sum is exactly the target, return it immediately
                }
            }
        }

        return closestSum; // Step 6: Return the closest sum
    }
}
