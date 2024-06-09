package com.example.techdemo.ds;

public class TwoPointerExample1 {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 4, 6};
        int target = 6;
        int[] result = findPairWithSum(array, target);
        if (result != null) {
            System.out.println("Pair found: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found.");
        }
    }

    public static int[] findPairWithSum(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return new int[]{array[left], array[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null; // No pair found
    }
}
